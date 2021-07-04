/*
 SE PONE LA PALABRA EXTENDS PARA ACCEDER A LAS PROPIEDADES Y METODOS DE LA CLASE PERSONA, LA CLASE PADRE
 LOS CONTRUCTORES NO SE HEREDAN PERO SE PUEDEN ACCEDER POR MEDIO DE LA PALABRA SUPER
 SUPER (NUMERO DE ARGUMENTOS) ASI ES COMO SE DIFERENCIAN
 */
package domain;

/**
 *
 * @author Gustavo
 */
public class Empleado extends Persona { //atributos de tipo private ya que no hay mas subclases
    private int idEmpleado; //se asignara de manera interna
    private double sueldo;
    private static int contadorEmpleado; //static para incrementar en uno cada vez que se cree un objeto de tipo Empleado
    
    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    
    public Empleado(String nombre, double sueldo) { //constructor para inicializar los atributos
        //super(nombre);//recibiendo el argumento desde la clase empleado, propagandola hacia la clase padre
        //se quito super por el this...el cual se llama al constructor vacio
        //this.idEmpleado = ++ Empleado.contadorEmpleado;
        this(); //se manda a llamar al constructor vacio
        this.nombre = nombre;
        this.sueldo = sueldo;        
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

//    public void setIdEmpleado(int idEmpleado) {
//        this.idEmpleado = idEmpleado; //ESTE NO PORQUE EL CONSTRUCTOR SE ENCARGA DE ASIGNAR EL VALOR 
//    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    //SOBREESCRIBIR EL COMPORTAMIENTO HEREDADO DE LA CLASE PADRE

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //EN LUGAR DE UTILIZAR EL + PARA CONCATENAR
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        //sb.append(", nombre=").append(nombre);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
