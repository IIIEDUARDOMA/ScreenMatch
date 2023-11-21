package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluiNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluiNoPlano(boolean incluiNoPlano) {
        this.incluiNoPlano = incluiNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibaFichaTecnica(){
        System.out.println("\nNome do Filme: " + getNome());
        System.out.println("Ano de Lançamento: " + getAnoDeLancamento());
        System.out.println("Duração do Filme: " + getDuracaoEmMinutos() + " minutos");
    }

    public void availa(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double obtemMedia(){
        return  somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
