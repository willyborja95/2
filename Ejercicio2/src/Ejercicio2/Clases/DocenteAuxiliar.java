package Ejercicio2.Clases;

public class DocenteAuxiliar extends Docente{
    
    private String strHorarioTutoria;

    public DocenteAuxiliar(String strIdentificacion, String strNombres, String strEmail, String strIdDocente, String strHorarioTutoria) {
        super(strIdentificacion, strNombres, strEmail, strIdDocente);
        setStrHorarioTutoria(strHorarioTutoria);
    }

    public String getStrHorarioTutoria() {
        return strHorarioTutoria;
    }

    public void setStrHorarioTutoria(String strHorarioTutoria) {
        this.strHorarioTutoria = strHorarioTutoria;
    }      
    
    public String toString(){
        return String.format(super.toString()+"Horario de tutoria: "+strHorarioTutoria+"\nEspecializacion: Docente Auxiliar");
    }
}