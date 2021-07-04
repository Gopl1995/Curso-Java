/*
 PUBLIC en la Clase puede ser utilizada desde otra clase ya sea desde el mismo paquete o un paquete externo
 PROTECTED no aplica en la Clases, la idea es permitir a las clases hijas acceder a los atributos, constructores y metodos de la clase Padre.
 PROTECTED solo se puede acceder cuando esta en el mismo paquete
 DEFATUL O PACKAGE ausencia de modificador, no puede ser utilizada fuera del paquete en el que esta
 PRIVATE no aplica en Clases, aplica a atributos, constructores y metodos. No se puede modificar el atributo desde otra clase
 para leer o modificar se tienen que agregar los metodos get y set (Encapsulamiento)
*/
package paquete1;

/**
 *
 * @author Gustavo
 */
public class Clase1 {
    /*SE COMENTO PARA PROBAR EL METODO PROTECTED
    public String atributoPublico = "Valor atributo publico";
    */
    protected String atributoProtected = "Valor atributo protected";
    
    private String atributoPrivado = "Valor atributo privado";
    
    //SE COMENTO PARA PROBAR EL METODO PROTECTED
    /*public Clase1(){
        System.out.println("Constructor Publico");
    }*/
    
    //SE COMENTO PARA PROBAR EL METODO PRIVADO
    /*protected Clase1(){
        System.out.println("Constructor Protected");
    }*/
    
    private Clase1(){
        System.out.println("Constructor Privado");
    }
    
    public Clase1(String arg){
        this();
        System.out.println("Constructor Publico");
    }
    
    public void metodoPublico(){
        System.out.println("Metodo publico");
    }
    
    protected void metodoProtegido(){
        System.out.println("Metodo protegido");
    }
    
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    
    
}
