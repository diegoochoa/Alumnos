/**
 * Created by dialo on 29/03/2017.
 */
public class Alumno {

    private String nombre;
    private static int cont = 1000;
    private int clave;

    public Alumno(String nombre)
    {
        this.nombre=nombre;
        clave = ++cont;
    }

    public String dimeNombre()
    {
        return nombre;
    }

    public int dimeClave()
    {
        return clave;
    }

    public static int dimeTotal()
    {
        return cont;
    }
}
