package clase04.aula.Hilos;

public class AplicacionHilos {

    public static void main(String[] args) {

        //doHiloHerencia();
        doHiloImplements();

    }

    public static void doHiloHerencia() {
        Hiloherencia hilo = new Hiloherencia();
        hilo.run();
    }

    public static void doHiloImplements() {
        HiloImplements hilo = new HiloImplements();
        Thread th = new Thread(hilo);
        th.start();

    }
}
