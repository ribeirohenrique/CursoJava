package entities;

public class PessoaFisica extends Contribuinte {

    private Double gastosSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, Double renda, Double gastosSaude) {
        super(nome, renda);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double impostoTotal() {
        double calculo = 0;
        if (super.getRenda() < 20.000) {
            calculo = super.getRenda() * 0.15;
        } else if (super.getRenda() >= 20.000) {
            calculo = super.getRenda() * 0.25;
        }

        if (gastosSaude != 0) {
            calculo -= (gastosSaude / 2);
        }

        return calculo;
    }
}

