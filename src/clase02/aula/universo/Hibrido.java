
package clase02.aula.universo;

import clase02.aula.universo.interfaces.Melmakiano;

class Hibrido extends Hombre implements Melmakiano{

    @Override
    public void comerGato() {
        System.out.println("COMIENDO GATOS");
    }

}
