package clase03.aula.Excepciones;

public class SaldoInsuficienteException extends Exception {

    public double saldo, cuantoDesea;

    public SaldoInsuficienteException(double saldo, double cuantoDesea) {
        super("En su cuenta tiene " + saldo + " soles. No puede retirar " + cuantoDesea + " soles.");

        this.saldo = saldo;
        this.cuantoDesea = cuantoDesea;

    }
}
