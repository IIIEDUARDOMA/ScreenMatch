import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        
        Filme oPoderosoChefao = new Filme("O Poderoso Chefão", 1972);
        Filme piratasDoCaribe = new Filme("Piratas do Caribe: A Maldição do Pérola Negra", 2003);
        Filme johnWick = new Filme("John Wick - De Volta ao Jogo", 2014);
        Serie lost = new Serie("Lost", 2004);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(oPoderosoChefao);
        lista.add(piratasDoCaribe);
        lista.add(johnWick);
        lista.add(lost);

        for (Titulo item:lista) {
            System.out.println("Nome: " + item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() >2){
                System.out.println("Classificação do Filme: " + filme.getClassificacao());
            }
        };

       ArrayList<String> buscaPorArtista = new ArrayList<>();
       buscaPorArtista.add("Keanu Reeves");
       buscaPorArtista.add("Marlon Brando");
       buscaPorArtista.add("Johnny Depp");

       Collections.sort(buscaPorArtista);
       System.out.println(buscaPorArtista);

       Collections.sort(lista);
        System.out.println(lista);


      lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("Ordenado por ano de lançamento");
        System.out.println(lista);
    }


}
