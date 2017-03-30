/**
 * Created by dialo on 29/03/2017.
 */
public class Principal {

    public void static main(String [] args)
    {
        Alumno a1 = new Alumno("Diego");
        Alumno a2 = new Alumno("Cecilia");
        Alumno a3 = new Alumno("Ramon");

        System.out.println(a1.dimeNombre() +" clave : " +a1.dimeClave());
        System.out.println(a2.dimeNombre() +" clave : " +a2.dimeClave());
        System.out.println(a3.dimeNombre() +" clave : " +a3.dimeClave());

        System.out.println("Cantidad de alumnos: "+Alumno.dimeTotal());
    }
}
