package clase02.aula.figuras;

public abstract class Shape  {

    private Double ancho;
    
    private Double alto;

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }
    
    public void imprimirAlto(){
        System.out.println("EL ALTO ES:" + getAlto());
    }
    
    public abstract Double getArea();
    public abstract void imprimirArea();
}
