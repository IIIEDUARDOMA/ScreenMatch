import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme favorito = new Filme();
        favorito.titulo = "O Poderoso Chefão";
        favorito.anoDeLancamento = 1972;
        favorito.duracaoEmMinutos = 175;

        favorito.exibaFichaTecnica();

        favorito.availa(9.5);
        favorito.availa(7);
        favorito.availa(10);

        System.out.println("\nTotal de Avaliações: " + favorito.getTotalDeAvaliacoes());
        System.out.println("\nNota média do br.com.alura.screenmatch.modelos.Filme" + favorito.obtemMedia());
    }
}
