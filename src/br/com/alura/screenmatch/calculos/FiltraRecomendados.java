package br.com.alura.screenmatch.calculos;

public class FiltraRecomendados {
    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >=4 ){
            System.out.println("Esta entre os favoritos do momento!");
        } else if (classificavel.getClassificacao() < 4 || classificavel.getClassificacao() >=2 ) {
            System.out.println("Muito bem avaliado no momento!");
        }else {
            System.out.println("Adicione na sua lista para assistir depois!");
        }
    }
}
