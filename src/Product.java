enum Category {
    MILK,
    WINE,
    COFFEE
}

public class Product {

    String name;
    Double price;
    String description;
    Category category;

    Product(String name, Double price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public Double getPrice() {return price;}
    public void setPrice(Double price) {this.price = price;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public Category getCategory() {return category;}
    public void setCategory(Category category) {this.category = category;}

}
