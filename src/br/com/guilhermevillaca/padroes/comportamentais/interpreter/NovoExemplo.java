// Interface base para todas as expressões
interface Expressao {
    int interpretar();
}

// Expressão terminal (um número)
class Numero implements Expressao {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    @Override
    public int interpretar() {
        return valor;
    }
}

// Expressão não terminal: soma
class Soma implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    public Soma(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int interpretar() {
        return esquerda.interpretar() + direita.interpretar();
    }
}

// Expressão não terminal: subtração
class Subtracao implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    public Subtracao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int interpretar() {
        return esquerda.interpretar() - direita.interpretar();
    }
}

// Expressão não terminal: multiplicação
class Multiplicacao implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    public Multiplicacao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int interpretar() {
        return esquerda.interpretar() * direita.interpretar();
    }
}

// Exemplo de uso
public class CalculadoraInterpreter {
    public static void main(String[] args) {
        // Montando a expressão: (5 + 3) * 2
        Expressao cinco = new Numero(5);
        Expressao tres = new Numero(3);
        Expressao dois = new Numero(2);

        Expressao soma = new Soma(cinco, tres);             // (5 + 3)
        Expressao expressaoFinal = new Multiplicacao(soma, dois); // (5 + 3) * 2

        System.out.println("(5 + 3) * 2 = " + expressaoFinal.interpretar());

        // Outro exemplo: (10 - 4) + 6
        Expressao dez = new Numero(10);
        Expressao quatro = new Numero(4);
        Expressao seis = new Numero(6);

        Expressao subtracao = new Subtracao(dez, quatro);   // (10 - 4)
        Expressao expressao2 = new Soma(subtracao, seis);   // (10 - 4) + 6

        System.out.println("(10 - 4) + 6 = " + expressao2.interpretar());
    }
}
