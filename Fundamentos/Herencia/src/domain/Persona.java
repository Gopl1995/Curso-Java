/*
 EL MODIFICADOR DE ACCESO PRIVATE NO PUEDE ACCEDER A CLASES HIJAS, SOLO ACCEDEN DE MANERA INDIRECTA GET Y SET PUBLICOS DE CADA ATRIBUTO
 EL MODIFICADOR DE ACCESO PROTECTED SI PUEDE ACCEDER A CLASES HIJAS, UTILIZADO MAS EN HERENCIA
 EL MODIFICADOR DE ACCESO PUBLIC PUEDE ACCEDER A CUALQUIER CLASE
 SINO INDICA NADA SOLO ES DE TIPO DEFAULT O PACKAGE, EL CUAL SOLO SE PUEDE ACCEDER DENTRO DEL PAQUETE
 */
package domain;

/**
 *
 * @author Gustavo
 */
public class Persona { // TODAS LAS CLASES HEREDAN DE LA CLASE OBJECT...NO ES NECESARIO AGREGARLO, EL COMPILADOR LO HACE AUTOMATICAMENTE
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    public Persona(){
        //vacio para poder generar objetos de tipo Persona, sin necesidad de inicializar los atributos de la clase.
    }
    
    //LOS CONSTRUCTORES ES PARA CREAR DISTINTOS OBJETOS DE DISTINTAS MANERAS CON VALORES INICIALES DE DISTINTAS MANERAS.
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

//    @Override
//    public String toString() {
//        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
