package entities;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {

    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getName());
        sb.append(" R$");
        sb.append(super.getPrice() + customsFee);
        sb.append(" (Customs fee: R$");
        sb.append(customsFee + ")");
        return sb.toString();
    }
}
