package Ejercicio2.Clases;

import java.util.ArrayList;
import java.util.Random;

public class RegistroAcademico {

    ArrayList<Persona> lstPersonas;
    ArrayList<ComponenteEducativo> lstComponentes;

    public RegistroAcademico(ArrayList<Persona> lstPersonas, ArrayList<ComponenteEducativo> lstComponentes) {
        this.lstPersonas = lstPersonas;
        this.lstComponentes = lstComponentes;
    }
    
    public void AgregarListaComponentes(ArrayList<ComponenteEducativo> alstComponentes) {
        this.lstComponentes = alstComponentes;
    }

    public void AgregarListaPersonas(ArrayList<Persona> alstPersonas) {
        this.lstPersonas = alstPersonas;
    }

    public String  Combinar() {
        String strOutput="";
        for (int i = 0; i < lstPersonas.size(); i++) {
            Random objRandom = new Random();
            ArrayList<Integer> lstIndicesOcupados;
            for (int j = 0; j < lstPersonas.size(); j++) {
                lstIndicesOcupados = new ArrayList<Integer>();
                int intNumeroComponentes = 1 + objRandom.nextInt(lstComponentes.size());
                strOutput = strOutput +"\nPERSONA No."+j+"\n"+lstPersonas.get(j)+"\n"+"COMPONENTE(S) ASIGNADO(S)"+"\n";
                for (int k = 0; k < intNumeroComponentes; k++) {
                    boolean repetir = false;
                    int intComponente;
                    do {
                        intComponente = objRandom.nextInt(lstComponentes.size());
                        for (int l = 0; l < lstIndicesOcupados.size() && repetir==false; l++) {
                            if (lstIndicesOcupados.get(l) == intComponente) {
                                repetir = true;
                            }
                        }
                    } while (repetir == true);
                    lstIndicesOcupados.add(intComponente);
                    strOutput = strOutput +"\n"+ lstComponentes.get(intComponente);
                }

            }

        }

        return strOutput;
    }

}
