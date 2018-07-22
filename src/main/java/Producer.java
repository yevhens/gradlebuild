public class Producer {

    String name;
    String address;
    Product product;

    public Producer(String name, String address, Product product) {
        this.name = name;
        this.address = address;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Product getProduct() {
        return product;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
