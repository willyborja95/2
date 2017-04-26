package Ejercicio2.Clases;

public class DocenteTitular extends Docente{
    
    private String strHorarioClase;

    public DocenteTitular(String strIdentificacion, String strNombres, String strEmail, String strIdDocente, String strHorarioClases) {
        super(strIdentificacion, strNombres, strEmail, strIdDocente);
        setStrHorarioClase(strHorarioClase);
    }   
    
    
    public String getStrHorarioClase() {
        return strHorarioClase;
    }

    public void setStrHorarioClase(String strHorarioClase) {
        this.strHorarioClase = strHorarioClase;
    }
    
    public String toString(){
        return String.format(super.toString()+"Horario de clase: "+strHorarioClase+"\nEspecializacion: Docente Titular");
    }
}