package clase01;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

public class PrimeraClase {

    public static void main(String[] args) {


        //PrimeraClase.ejercicio5();
        //PrimeraClase.ejercicio6();
        //PrimeraClase.ejemploSwitch();
        //PrimeraClase.ejemploWhile();
        //PrimeraClase.ejemploDoWhile();
        //PrimeraClase.ejemploFor();
        //PrimeraClase.ejercicio7(80);
        //PrimeraClase.ejercicioMatrices();
        //PrimeraClase.ejercicioMatrizBidimensional();
        PrimeraClase.ejercicio08(11);

    }

    public static void ejercicio5() {
        int x = 5;
        int y = 8;
        int z = 6;
        int solucion = x + y - 3 * z;

        System.out.println("ejercicio5 solucion: " + solucion);
    }

    public static void ejercicio6() {
        Double resultado = 7d * (15d + 1d) * 2d % 2d;
        System.out.println("ejercicio6 resultado: " + resultado);

        Boolean resultado2 = (0.0 / 0.0) == (0.0 / 0.0);
        System.out.println("ejercicio6 resultado2: " + resultado2);

        Boolean resultado3 = (!true && false);
        System.out.println("ejercicio6 resultado3: " + resultado3);

        Boolean resultado4 = ((3 * 4 >= 12) && (3.5 > 1 + 2f)) || (4 < 8);
        System.out.println("ejercicio6 resultado4: " + resultado4);

        Boolean resultado5 = !(true == false);
        System.out.println("ejercicio6 resultado5: " + resultado5);

        Boolean resultado6 = (!true == false);
        System.out.println("ejercicio6 resultado6: " + resultado6);

        String animal1 = "perro";
        String animal2 = "gato";

        //boolean resultado = (!animal1.equals(animal2));
    }

    public static void ejercicio7(int edad) {

        /*
         Supongamos que tenemos una tienda de ropa, sobre la ropa vamos a aplicar 
         * un % de descuento según las edades. Si el cliente es menor de edad tendrá un 
         * descuento del 15%, si es mayor de 60 año tendrá un descuento del 30%. 
         * El resto de clientes pagaran la ropa sin descuentos. Tenemos que hacer 
         * un programa que guarde el % correcto en una variable (porcentaje) según 
         * la edad de la variable cliente.
         */
        double porcentaje = 0;

        if (edad < 18) {
            porcentaje = 0.15;
        } else if (edad > 60) {
            porcentaje = 0.30;
        } else {
            porcentaje = 0.00;
        }
        System.out.println("porcentaje: " + porcentaje);
    }

    public static void ejemploSwitch() {

        int diaSemana = 5;
        String textoSemana = "";
        switch (diaSemana) {
            case 1:
                textoSemana = "Domingo";
                break;
            case 6:
                textoSemana = "Viernes";
                break;
            default:
                textoSemana = "Otros";
                break;
        }

        System.out.println(textoSemana);

    }

    public static void ejemploWhile() {

        int contador = 0;

        while (contador < 10) {

            ++contador; //es igual a contador = contador + 1

            if (contador == 6) {
                ++contador;
                continue;
            }
            System.out.println(contador);
            ++contador;
        }
    }

    public static void ejemploDoWhile() {

        int contador = 10;

        do {
            System.out.println(contador);
            ++contador; //es igual a contador = contador + 1
        } while (contador < 10);
    }

    public static void ejemploFor() {

        for (int i = 0; i < 10; i++) {

            if (i == 6) {
                break;
            }
            System.out.println(i);
        }

    }

    public static void ejercicio08(int mes) {
        /*
         Realice un programa que diga cuanto días tiene un mes, el mes esta
         * contenido de forma numérica en una variable de tipo int llamada mes.
         */
        int[] meses = {30, 28, 31, 30, 31, 30, 31, 30, 31, 31, 28, 30};

        if (mes <= meses.length) {
            System.out.println(meses[mes - 1]);
        }

    }

    public static void ejercicioMatrices() {

        String[] matrizNumeros = new String[5];
        matrizNumeros[0] = "648";
        matrizNumeros[1] = "342";
        matrizNumeros[2] = "3424";
        matrizNumeros[3] = "642";

        for (int i = 0; i < matrizNumeros.length; i++) {
            System.out.println(matrizNumeros[i]);
        }
    }

    public static void ejercicioMatrizBidimensional() {

        int matriz[][] = new int[5][2];

        matriz[0][0] = 123;
        matriz[0][1] = 12345;

        matriz[1][0] = 12311111;
        matriz[1][1] = 123415;

        matriz[2][0] = 12113;
        matriz[2][1] = 1112345;

        for (int i = 0; i < matriz.length; i++) { //for recorre [5]
            for (int j = 0; j < matriz[i].length; j++) { //for recorre [2]
                System.out.println(matriz[i][j]);
            }
        }




    }
}
