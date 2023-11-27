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
        System.out.println("\nNota média do Filme" + favorito.obtemMedia());



        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setEpisodiosPorTemporada(14);
        lost.setTemporadas(6);
        lost.setMinutosPorEpisodio(48);


        lost.exibaFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(favorito);
        calculadora.inclui(lost);

        System.out.println(calculadora.getTempoTotal());

    }
}
