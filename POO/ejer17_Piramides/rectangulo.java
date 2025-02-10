package POO.ejer17_Piramides;

public class rectangulo {
    private int base;
    private int altura;
    static int rectagunlosCreados;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
        rectagunlosCreados++;
    }

    @Override
    public String toString() {
        return "rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
