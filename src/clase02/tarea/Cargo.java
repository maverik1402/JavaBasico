package clase02.tarea;

public class Cargo {

    private int idCargo;
    private String nombreCargo;
    private Long sueldoCargo;
    private Empresa empresa;
    private Empleado empleado;
    private Cargo subcargo;

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public Long getSueldoCargo() {
        return sueldoCargo;
    }

    public void setSueldoCargo(Long sueldoCargo) {
        this.sueldoCargo = sueldoCargo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the subcargo
     */
    public Cargo getSubcargo() {
        return subcargo;
    }

    /**
     * @param subcargo the subcargo to set
     */
    public void setSubcargo(Cargo subcargo) {
        this.subcargo = subcargo;
    }

    @Override
    public String toString() {
        return getIdCargo() + "\t" + getNombreCargo(); //To change body of generated methods, choose Tools | Templates.
    }
}
