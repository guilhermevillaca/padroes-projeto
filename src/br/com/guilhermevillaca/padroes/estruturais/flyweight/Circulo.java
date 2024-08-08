package br.com.guilhermevillaca.padroes.estruturais.flyweight;

/**
 *
 * @author villaca
 */
public class Circulo implements Forma {

    private String cor;
    private int x;
    private int y;
    private int raio;

    public Circulo(String cor) {
        this.cor = cor; // A cor é a parte intrínseca (compartilhada)
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando círculo [Cor: " + cor + ", x: " + x + ", y: " + y + ", raio: " + raio + "]");
    }
}
