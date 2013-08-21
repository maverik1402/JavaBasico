
package clase02.tarea;

import java.util.Collection;
import java.util.Date;

public class Empleado extends Persona{
    
    private int idEmpleado;
    private Date fechaIngresoEmp;
    private Collection<Empresa> empresas;// un empleado puede trabajar en muchas empresas

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the fechaIngresoEmp
     */
    public Date getFechaIngresoEmp() {
        return fechaIngresoEmp;
    }

    /**
     * @param fechaIngresoEmp the fechaIngresoEmp to set
     */
    public void setFechaIngresoEmp(Date fechaIngresoEmp) {
        this.fechaIngresoEmp = fechaIngresoEmp;
    }

    public Collection<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Collection<Empresa> empresas) {
        this.empresas = empresas;
    }

    public void imprimirEmpresas(){
        System.out.println("LISTA DE EMPRESAS");
        for(Empresa empresa:getEmpresas()){
            System.out.println(empresa);
        }
    }
}
