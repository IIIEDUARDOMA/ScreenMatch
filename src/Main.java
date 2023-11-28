import br.com.alura.screenmatch.calculadoraDeTempo.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme favorito = new Filme();
        favorito.setNome( "O Poderoso Chefão");
        favorito.setAnoDeLancamento(1972);
        favorito.setDuracaoEmMinutos(175);
        favorito.setIncluiNoPlano(true);
        favorito.setDiretor("Francis Ford Coppola");

        favorito.exibaFichaTecnica();
        System.out.println("Nome do Diretor: "+ favorito.getDiretor());

        favorito.availa(9.5);
        favorito.availa(7);
        favorito.availa(10);

        System.out.println("\nTotal de Avaliações: " + favorito.getTotalDeAvaliacoes());
        System.out.println("\nNota média do Filme: " + favorito.obtemMedia());

        Filme johnWick = new Filme();
        johnWick.setNome( "John Wick - De Volta ao Jogo");
        johnWick.setAnoDeLancamento(2014);
        johnWick.setDuracaoEmMinutos(101);
        johnWick.setIncluiNoPlano(true);
        johnWick.setDiretor("Chad Stahelski");

        johnWick.exibaFichaTecnica();
        System.out.println("Nome do Diretor: "+ johnWick.getDiretor());

        johnWick.availa(9.2);
        johnWick.availa(9);
        johnWick.availa(8.7);

        System.out.println("\nTotal de Avaliações: " + johnWick.getTotalDeAvaliacoes());
        System.out.println("\nNota média do Filme: " + johnWick.obtemMedia() + "minutos");




        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setEpisodiosPorTemporada(14);
        lost.setAtiva(true);
        lost.setIncluiNoPlano(true);
        lost.setTemporadas(6);
        lost.setMinutosPorEpisodio(48);


        lost.exibaFichaTecnica();

        Serie laCasaDePapel = new Serie();
        laCasaDePapel.setNome("La Casa De Papel");
        laCasaDePapel.setAnoDeLancamento(2019);
        laCasaDePapel.setEpisodiosPorTemporada(22);
        laCasaDePapel.setAtiva(true);
        laCasaDePapel.setIncluiNoPlano(true);
        laCasaDePapel.setTemporadas(5);
        laCasaDePapel.setMinutosPorEpisodio(45);


        laCasaDePapel.exibaFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(favorito);
        calculadora.inclui(johnWick);
        calculadora.inclui(lost);
        calculadora.inclui(laCasaDePapel);

        System.out.println("\nTempo total para assistir filmes e series selecionados: " + calculadora.getTempoTotal() + " minutos");

    }
}
