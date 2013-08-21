
package clase02.tarea;

public class Empresa {
  
   private String nacionalidad;//llave de nacionalidad
   
   private int idEmpresa;
   private String nombre;
   private String razonSocial;
   private String telefono;
   private String ruc;
   private String direccion;
   private String permisoOperacion;
   private Pais pais;

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

  
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRuc() {
        return ruc;
    }


    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

 
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

 
    public String getPermisoOperacion() {
        return permisoOperacion;
    }

    public void setPermisoOperacion(String permisoOperacion) {
        this.permisoOperacion = permisoOperacion;
    }


    public Pais getPais() {
        return pais;
    }


    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return getIdEmpresa()+"\t"+getNombre()+"\t"+getDireccion(); //To change body of generated methods, choose Tools | Templates.
    }
}
