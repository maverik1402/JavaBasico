package clase03.aula.Excepciones;

public class Cuenta {

    private long idCuenta;
    private double  saldoActual;
    public Cuenta(long idCuenta) {
        this.idCuenta = idCuenta;
        this.saldoActual = 5000;
    }

    public double retirarDeCajero(double cuantoDesea) throws SaldoInsuficienteException {
        
        if (saldoActual < cuantoDesea) {
            throw new SaldoInsuficienteException(saldoActual, cuantoDesea);
        } else {
            return saldoActual - cuantoDesea;
        }
    }
}
