import java.util.*;

// Contrato comum para todas as expressões
interface Expressao {
    boolean interpretar(Artigo artigo);
}

// Entidade básica
class Artigo {
    private String titulo;

    public Artigo(String titulo) {
        this.titulo = titulo.toLowerCase();
    }

    public String getTitulo() {
        return titulo;
    }
}

// Expressão terminal (palavra-chave)
class Palavra implements Expressao {
    private String termo;

    public Palavra(String termo) {
        this.termo = termo.toLowerCase();
    }

    @Override
    public boolean interpretar(Artigo artigo) {
        return artigo.getTitulo().contains(termo);
    }
}

// Expressões não-terminais (combinadores)
class AndExpressao implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    public AndExpressao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public boolean interpretar(Artigo artigo) {
        return esquerda.interpretar(artigo) && direita.interpretar(artigo);
    }
}

class OrExpressao implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    public OrExpressao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public boolean interpretar(Artigo artigo) {
        return esquerda.interpretar(artigo) || direita.interpretar(artigo);
    }
}



public class Main {
    public static void main(String[] args) {
        List<Artigo> artigos = Arrays.asList(
            new Artigo("Arquitetura de Software Moderna"),
            new Artigo("Padrão MVC na Web"),
            new Artigo("Model View Controller explicado"),
            new Artigo("Introdução a Inteligência Artificial")
        );

        // Expressão da query:
        // "arquitetura de software & (mvc or model view controller)"
        Expressao termo1 = new Palavra("arquitetura de software");
        Expressao termo2 = new Palavra("mvc");
        Expressao termo3 = new Palavra("model view controller");

        Expressao or = new OrExpressao(termo2, termo3);
        Expressao query = new AndExpressao(termo1, or);

        // Avaliar artigos
        for (Artigo artigo : artigos) {
            if (query.interpretar(artigo)) {
                System.out.println("Encontrado: " + artigo.getTitulo());
            }
        }
    }
}

