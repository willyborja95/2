package Ejercicio2.Clases;

public class Persona{
    private String strIdentificacion;
    private String strNombres;
    private String strEmail;

    public Persona(String strIdentificacion, String strNombres, String strEmail) {
        setStrIdentificacion(strIdentificacion);
        setStrNombres(strNombres);
        setStrEmail(strEmail);
    }

    public String getStrIdentificacion() {
        return strIdentificacion;
    }

    public void setStrIdentificacion(String strIdentificacion) {
        this.strIdentificacion = strIdentificacion;
    }

    public String getStrNombres() {
        return strNombres;
    }

    public void setStrNombres(String strNombres) {
        this.strNombres = strNombres;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }
    
    @Override
    public String toString() {
        return String.format("Identificacion = " + strIdentificacion + "\nNombres = " + strNombres + "\nEmail = " + strEmail);
    }
    
    
}