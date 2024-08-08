package br.com.guilhermevillaca.padroes.estruturais.flyweight;

/**
 *
 * @author villaca
 *
 * Explicação Forma é a interface que define o método desenhar(). Circulo é a
 * implementação concreta de Forma e representa o objeto que queremos
 * reutilizar. A cor do círculo é a parte intrínseca (compartilhada), enquanto
 * as coordenadas e o raio são extrínsecos (não compartilhados). FormaFactory é
 * a fábrica Flyweight que gerencia a criação e o compartilhamento de objetos
 * Circulo. Se um círculo de uma cor específica já existe, ele é reutilizado;
 * caso contrário, um novo círculo é criado. A classe FlyweightPatternDemo
 * demonstra como o padrão Flyweight pode ser usado para desenhar múltiplos
 * círculos enquanto minimiza a criação de novos objetos, economizando memória.
 * Esse exemplo mostra como o padrão Flyweight é útil para otimizar a utilização
 * de recursos ao compartilhar objetos que têm partes semelhantes (intrínsecas)
 * e partes específicas (extrínsecas).
 */
public class Principal {

    private static final String[] cores = {"Vermelho", "Verde", "Azul", "Branco", "Preto"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circulo circulo = (Circulo) FormaFactory.getCirculo(getCorAleatoria());
            circulo.setX(getCoordenadaAleatoria());
            circulo.setY(getCoordenadaAleatoria());
            circulo.setRaio(100);
            circulo.desenhar();
        }
    }

    private static String getCorAleatoria() {
        return cores[(int) (Math.random() * cores.length)];
    }

    private static int getCoordenadaAleatoria() {
        return (int) (Math.random() * 100);
    }
}
