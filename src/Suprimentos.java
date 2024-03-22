public class Suprimentos{
    private int numberItem;
    private String description;
    private int quantity;
    private double value;

    public Suprimentos(int numberItem, String description, int quantity, double value) {
        this.numberItem = numberItem;
        this.description = description;
        this.quantity = quantity;
        this.value = value;
    }

    public int getNumberItem() {
        return numberItem;
    }

    public void setNumberItem(int numberItem) {
        this.numberItem = numberItem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(quantity, 0);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = Math.max(value, 0);
    }

    public double getInvoiceAmount(){
        return value * quantity;
    }
}

