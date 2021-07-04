/*
 CLASE ABSTRACTA, palabra reservada abstract, definir metodos que no tienen ninguna implementacion, si contiene un metodo abstracto
por lo menos toda la clase debe ser abstracta.
 Esta clase hace referencia a una clase muy generica, se obliga a las clases hijas a agregar el metodo especifico a la clase padre
 */
package domain;

/**
 *
 * @author Gustavo
 */
public abstract class FiguraGeometrica {
    private String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    public abstract void dibujarFigura(); //no se pone nada dentro del contenido

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
    
    
}
