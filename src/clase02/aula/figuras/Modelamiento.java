package clase02.aula.figuras;

import clase02.aula.universo.ETMarte;


public class Modelamiento {

    public static void main(String[] args) {
        
        
    }

    public static void doAbstracto() {

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(10d);

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAlto(10d);
        rectangulo.setAncho(20d);

        System.out.println(cuadrado.getArea());
        System.out.println(rectangulo.getArea());
        
    }
}
