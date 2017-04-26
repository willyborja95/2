package Ejercicio2.Clases;

public class ComponenteEducativo{

    private String strCodigo;
    private String strNombre;
    private int intNumeroCredito;

    public ComponenteEducativo(String strCodigo, String strNombre, int intNumeroCredito) {
        setStrCodigo(strCodigo);
        setStrNombre(strNombre);
        setIntNumeroCredito(intNumeroCredito);
    }

    public String getStrCodigo() {
        return strCodigo;
    }

    public void setStrCodigo(String strCodigo) {
        this.strCodigo = strCodigo;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public int getIntNumeroCredito() {
        return intNumeroCredito;
    }

    public void setIntNumeroCredito(int intNumeroCredito) {
        this.intNumeroCredito = intNumeroCredito;
    }
    
    

    @Override
    public String toString() {
        return String.format("Codigo = " + strCodigo + "\nNombre=" + strNombre + "\nNumero de Créditos = " + intNumeroCredito);
    }
    
    
}