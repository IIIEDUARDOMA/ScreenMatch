import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltraRecomendados;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

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
        System.out.println("\nNota média do Filme: " + johnWick.obtemMedia());

        Filme piratasDoCaribe = new Filme();
        piratasDoCaribe.setNome( "Piratas do Caribe: A Maldição do Pérola Negra");
        piratasDoCaribe.setAnoDeLancamento(2003);
        piratasDoCaribe.setDuracaoEmMinutos(143);
        piratasDoCaribe.setIncluiNoPlano(true);
        piratasDoCaribe.setDiretor("Gore Verbinski");

        piratasDoCaribe.exibaFichaTecnica();
        System.out.println("Nome do Diretor: "+ piratasDoCaribe.getDiretor());

        piratasDoCaribe.availa(9);
        piratasDoCaribe.availa(9);
        piratasDoCaribe.availa(8);

        System.out.println("\nTotal de Avaliações: " + piratasDoCaribe.getTotalDeAvaliacoes());
        System.out.println("\nNota média do Filme: " + piratasDoCaribe.obtemMedia());


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

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(100);


        laCasaDePapel.exibaFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(favorito);
        calculadora.inclui(johnWick);
        calculadora.inclui(lost);
        calculadora.inclui(laCasaDePapel);

        System.out.println("\nTempo total para assistir filmes e series selecionados: " + calculadora.getTempoTotal() + " minutos");


        FiltraRecomendados recomendados = new FiltraRecomendados();

        recomendados.filtra(favorito);
        recomendados.filtra(episodio);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(favorito);
        listaDeFilmes.add(piratasDoCaribe);
        listaDeFilmes.add(johnWick);

        System.out.println("\nTamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome() + " (" + listaDeFilmes.getFirst().getAnoDeLancamento() + ")");
        System.out.println("Lista de filmes; " + listaDeFilmes);
    }
}
