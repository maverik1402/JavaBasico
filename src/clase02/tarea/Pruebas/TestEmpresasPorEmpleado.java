package clase02.tarea.Pruebas;

import clase02.tarea.Empleado;
import clase02.tarea.Empresa;
import java.util.ArrayList;
import java.util.Collection;

public class TestEmpresasPorEmpleado {
    public static void main(String[] args) {
        Empleado empleado=new Empleado();
        empleado.setIdEmpleado(1);
        empleado.setNombrePersona("FRANK");
        empleado.setApellidoPaterno("APAZA");
        empleado.setApellidoMaterno("COLQUE");

        Collection<Empresa> empresas=new ArrayList();
        
        Empresa empresa1=new Empresa();
        empresa1.setIdEmpresa(1);
        empresa1.setNombre("EMPRESA1");
        empresa1.setDireccion("DIRECCION1");
        empresas.add(empresa1);
        
        Empresa empresa2=new Empresa();
        empresa2.setIdEmpresa(2);
        empresa2.setNombre("EMPRESA2");
        empresa2.setDireccion("DIRECCION2");
        empresas.add(empresa2);
        
        empleado.setEmpresas(empresas);
        //IMPRIMIENDO
        System.out.println("EMPLEADO");
        System.out.println("CODIGO: "+empleado.getIdEmpleado());
        System.out.println("NOMBRES: "+empleado.getNombrePersona()+" "+
                empleado.getApellidoPaterno()+" "+
                empleado.getApellidoMaterno());
        //empleado.almorzar(); IMPLEMENTANDO EL METODO
        System.out.println("EMPRESAS DONDE TRABAJA");
        for(Empresa empresa:empleado.getEmpresas()){
            System.out.println(empresa);
        }
    }
}
