package br.com.alura.screenmatch.modelos;

public class Filme {
    public String titulo;
    int anoDeLancamento;
    boolean incluiNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public void exibaFichaTecnica(){
        System.out.println("Nome do br.com.alura.screenmatch.modelos.Filme: " + titulo);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração do br.com.alura.screenmatch.modelos.Filme: " + duracaoEmMinutos + " minutos");
    }

   public void availa(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double obtemMedia(){
        return  somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
