package clase04.aula.Hilos;

public class Hiloherencia extends Thread {

    
    
    
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
    }
}
