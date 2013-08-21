
package clase02.aula.figuras;

public class Rectangulo extends Shape{

    @Override
    public Double getArea() {
        return this.getAlto()*this.getAncho();
    }

    @Override
    public void imprimirAlto() {
        System.out.println("IMPRIMIENDO ALTURA DE EL RECTANGULO: "+getAlto());
    }

    @Override
    public void imprimirArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
