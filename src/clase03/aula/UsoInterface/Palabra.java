package clase03.aula.UsoInterface;

public class Palabra implements Capitalizable {

    private String texto;

    public Palabra(String texto) {
        this.texto = texto.replaceAll(" ", "");
    }
    @Override
    public String cambiaMayuscula() {
        return this.texto.toUpperCase();
    }

    @Override
    public String cambiaMinuscula() {
        return this.texto.toLowerCase();
    }
}
