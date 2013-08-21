
package clase02.tarea.Pruebas;

import clase02.tarea.Cargo;
import clase02.tarea.Empleado;
import clase02.tarea.Empresa;

public class Test {
    
    public static void main(String[] args) {
        
        //Empleado emp = new Empleado();        
        Cargo cargo = new Cargo();
        cargo.setIdCargo(1);
        cargo.setNombreCargo("PRIMERO");
        cargo.setSubcargo(new Cargo());
        cargo.getSubcargo().setIdCargo(2);
        cargo.getSubcargo().setNombreCargo("SEGUNDO");
        cargo.getSubcargo().setSubcargo(new Cargo());
        cargo.getSubcargo().getSubcargo().setIdCargo(3);
        cargo.getSubcargo().getSubcargo().setNombreCargo("TERCERO");
        System.out.println("TEST");
        System.out.println(cargo);
        System.out.println(cargo.getSubcargo());
        System.out.println(cargo.getSubcargo().getSubcargo());
        
        
        Empresa empresa = new Empresa();
        empresa.setNombre(null);
        empresa.getPais().getNombrePais();
    }
    
    
}
