package clase03.aula.Excepciones;

public class ProgramaCuentas {

    public static void main(String args[]) {
        try {
            Cuenta c = new Cuenta(001);
            double nuevoSaldo = c.retirarDeCajero(7000);
            System.out.println("OPERACION REALIZADA, su saldo es: " + nuevoSaldo);
        } catch (SaldoInsuficienteException e) {
            System.err.println(e.getMessage());
        }
    }
}
