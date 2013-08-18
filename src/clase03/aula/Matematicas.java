
package clase03.aula;

public class Matematicas {
    
    public static void main(String[] args) {
        Matematicas.getConstants();
        System.out.println(Matematicas.doOperaciones());
        Matematicas.wrappers();
    }
    
    public static void getConstants(){
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
    
    public static double doOperaciones(){
        //return Math.sqrt(144);
        //return Math.abs(1);
        //return Math.exp(5);
        //return Math.min(10, 8);
        return Math.max(10, 8);
    }
    
    public static void wrappers(){
        Integer entero = new Integer(0);
        System.out.println(entero.toString());
    }
}
