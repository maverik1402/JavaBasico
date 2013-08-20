package clase02.aula.universo;

import clase02.aula.universo.interfaces.ET;

public class ETMarte extends Alieniegena implements ET {

    @Override
    public void volarBicicleta() {
        System.out.println("VOLANDO UNA MISTER!!!!");
    }
    
    protected void disparar(){
        System.out.println("disparar");
    }
}
