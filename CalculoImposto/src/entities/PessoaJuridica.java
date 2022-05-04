package entities;

public class PessoaJuridica extends Contribuinte {

    private Integer numeroFuncionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, Double renda, Integer numeroFuncionarios) {
        super(nome, renda);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double impostoTotal() {
        double calculo = 0;
        if (numeroFuncionarios > 10) {
            calculo = super.getRenda() * 0.14;
        } else {
            calculo = super.getRenda() * 0.17;
        }

        return calculo;
    }
}
