package Ejercicio2.Ejecutor;

import Ejercicio2.Clases.Alumno;
import Ejercicio2.Clases.ComponenteEducativo;
import Ejercicio2.Clases.DocenteAuxiliar;
import Ejercicio2.Clases.DocenteTitular;
import Ejercicio2.Clases.Persona;
import Ejercicio2.Clases.RegistroAcademico;
import Ejercicio2.GestionArchivo.GuardarArchivo;
import java.util.ArrayList;
import java.util.Scanner;

class Ejecutor{
    
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.print("Total de personas a ingresar: ");
        int intNumeroPersonas = lec.nextInt();
        lec.nextLine();
        ArrayList <Persona> lstPersonas = new ArrayList<Persona>();
        ArrayList <ComponenteEducativo> lstComponente = new ArrayList<ComponenteEducativo>();
        Persona objPersona;
        ComponenteEducativo objComponente;
        RegistroAcademico objRegistro;
        DocenteTitular objDocenteTit;
        DocenteAuxiliar objDocenteAux;
        for (int i = 0; i < intNumeroPersonas; i++) {
            System.out.println("\nPERSONA NO."+i);
            System.out.print("Identificacion: ");
            String strIdentificacion = lec.nextLine();
            System.out.print("Nombres: ");
            String strNombres = lec.nextLine();
            System.out.print("Email: ");
            String strEmail = lec.nextLine();
            System.out.print("Ingrese el rol de la persona:\n1 - Si es alumno\n2 - Si es Docente");
            int intOpcion = lec.nextInt();
            lec.nextLine();
            switch(intOpcion){
                case 1:
                    System.out.print("Id del alumno: ");
                    String strIdAlumno = lec.nextLine();
                    objPersona = new Alumno(strIdentificacion, strNombres, strEmail, strIdAlumno);
                    lstPersonas.add(objPersona);
                    break;
                
                case 2:
                    System.out.print("Id del docente: ");
                    String strIdDocente = lec.nextLine();
                    System.out.println("Ingrese tipo de docente:\n1 - Docente titular\n2 - Docente Auxiliar");
                    int intOpcion2 = lec.nextInt();
                    lec.nextLine();
                    switch(intOpcion2){
                        case 1:
                            System.out.print("Ingrese el horario de clase: ");
                            String strHorarioClase = lec.nextLine();
                            objDocenteTit = new DocenteTitular(strIdentificacion, strNombres, strEmail, strIdDocente, strHorarioClase);
                            lstPersonas.add(objDocenteTit);
                            break;
                        
                        case 2:
                            System.out.print("Ingrese el horario de tutoria: ");
                            String strHorarioTut = lec.nextLine();
                            objDocenteAux = new DocenteAuxiliar(strIdentificacion, strNombres, strEmail, strIdDocente, strHorarioTut);
                            lstPersonas.add(objDocenteAux);
                            break;
                    }
            }
            
        }
        System.out.print("Ingrese el número de componentes: ");
        int intNumeroComponentes = lec.nextInt();
        lec.nextLine();
        for (int i = 0; i < intNumeroComponentes; i++) {
            System.out.println("\nCOMPONENTE NO."+i);
            System.out.print("Codigo: ");
            String strCodigo = lec.nextLine();
            System.out.print("Nombre: ");
            String strNombre = lec.nextLine();
            System.out.print("Numero créditos: ");
            int intNumeroCreditos = lec.nextInt();
            lec.nextLine();
            objComponente = new ComponenteEducativo(strCodigo, strNombre, intNumeroCreditos);
            lstComponente.add(objComponente);
        }
        objRegistro = new RegistroAcademico(lstPersonas, lstComponente);
        GuardarArchivo objGuardarArchivo = new GuardarArchivo();
        objGuardarArchivo.AbrirArchivo();
        objGuardarArchivo.AgregarInformacion(objRegistro.Combinar());
        objGuardarArchivo.CerrarArchivo();
    }
}