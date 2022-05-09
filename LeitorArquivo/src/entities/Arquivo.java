package entities;

public class Arquivo {

    private String name;
    private Double precoUnitario;
    private int quantidade;

    public Arquivo(String name, Double precoUnitario, int quantidade) {
        this.name = name;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double valorTotal() {
        return quantidade * precoUnitario;
    }
}
