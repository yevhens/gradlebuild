public class Product {

    private String name;
    private String technicalcharacteristics;
    private int price;

    public Product(String name, String technicalcharacteristics, int price) {
        this.name = name;
        this.technicalcharacteristics = technicalcharacteristics;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getTechnicalcharacteristics() {
        return technicalcharacteristics;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTechnicalcharacteristics(String technicalcharacteristics) {
        this.technicalcharacteristics = technicalcharacteristics;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
