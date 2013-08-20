
package clase03.aula;

import java.util.Date;

public class ClaseObject {
    
    public static void main(String[] args) {
        //ClaseObject.doEquals();
        //ClaseObject.doToString();
        ClaseObject.rareCompare();

    }
    
    public static void doEquals(){
        /*
        Date fechaNacimiento = new Date();
        Date fechaCumpleaños = fechaNacimiento;
        
        if(fechaNacimiento == fechaCumpleaños){
            System.out.println("iguales");
        }*/
        
    
        Date fechaNacimiento = new Date();
        Date fechaCumpleaños = new Date();
        
        if(fechaNacimiento == fechaCumpleaños){
            System.out.println("iguales");
        }//no son iguales porque comparas objetos
        
        if(fechaNacimiento.equals(fechaCumpleaños)){
            System.out.println("iguales");
        }
        //compara contenido   
    }
    
    public static void doToString(){
         Date fechaNacimiento = new Date();
         System.out.println(fechaNacimiento);
         System.out.println(fechaNacimiento.toString());
    }
    
    //sobreescribiendo el metodo toString()
    public static void overrideToString(){
        ClaseObject object = new ClaseObject();
        System.out.println(object.toString());
    }
    
    @Override
    public String toString(){
        return "EXPLICACION CLASE OBJECT";
    }
    
    public static void rareCompare(){
        Integer numero1 = 12;
        Integer numero2 = 12;
        
        Integer numeroX = new Integer(12);
        Integer numeroY = new Integer(12);
        
        
        if(numero1==numero2){
            System.out.println("iguales a y b");
        }//son iguales porque se les esta asignando valores
        
        if(numeroX == numeroY){
            System.out.println("iguales x e y");
        }else{
            System.out.println("no son iguales x e y");
        }//no son iguales porque estan en diferentes lados de memoria
            
        
        if(numeroX.intValue() == numeroY){ 
            System.out.println("iguales x e y by getint");
        }
        
        if(numeroX.equals(numeroY)){ 
            System.out.println("iguales x e y by equals");
        }
        
        //final = no se puede modificar
        
        
    }
    
}
