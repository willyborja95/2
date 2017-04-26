package Ejercicio2.Clases;

public class Alumno extends Persona{
    
    private String strIdAlumno;

    public Alumno(String strIdentificacion, String strNombres, String strEmail, String strIdAlumno) {
        super(strIdentificacion, strNombres, strEmail);
        setStrIdAlumno(strIdAlumno);
    }

    public String getStrIdAlumno() {
        return strIdAlumno;
    }

    public void setStrIdAlumno(String strIdAlumno) {
        this.strIdAlumno = strIdAlumno;
    }
    
    public String toString(){
        return String.format(strIdAlumno);
    }
}