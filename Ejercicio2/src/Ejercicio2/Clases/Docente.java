package Ejercicio2.Clases;

public class Docente extends Persona{
    
    private String strIdDocente;

    public Docente(String strIdentificacion, String strNombres, String strEmail, String strIdDocente) {
        super(strIdentificacion, strNombres, strEmail);
        setStrIdDocente(strIdDocente);
    }

    public String getStrIdDocente() {
        return strIdDocente;
    }

    public void setStrIdDocente(String strIdDocente) {
        this.strIdDocente = strIdDocente;
    }

    @Override
    public String toString() {
        return "Docente{" + "strIdDocente=" + strIdDocente + '}';
    }
    
    
}