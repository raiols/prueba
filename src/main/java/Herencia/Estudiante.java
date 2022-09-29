
package Herencia;
/*La herencia es una forma de reutilización de software en la que se crea una nueva clase al absorver los miembros de una 
ya existente.
*/

public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;
    
    public Estudiante(String nombre,String apellido, int edad,int codigoEstudiante, float notaFinal){
        super(nombre,apellido,edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal= notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("nombre:"+getNombre()+
                "\nApellido:"+getApellido()+
                "\nEdad:"+getEdad()+
                "\nCodigo Estudiante:"+codigoEstudiante+
                "\nNOTA fINAL."+notaFinal);
    }
}
