import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {

        System.out.print("\n");

        Product coconutMilk = new Product("Aroy-D",190.0,"1L", Category.MILK);
        Product soyaMilk = new Product("Alpro", 80.0, "1L", Category.MILK);
        Product sparklingWine = new Product("Veuve Clicquot", 1090.0, "0.375", Category.WINE);
        Product whiteWine = new Product("Marlborough Sun", 380.0, "0.75", Category.WINE);
        Product groundCoffee = new Product("Illy", 222.0, "0.25KG", Category.COFFEE);
        Product instantCoffee = new Product("Jacobs", 125.0, "0.19KG", Category.COFFEE);

        Product [] allProducts = {coconutMilk, soyaMilk, sparklingWine, whiteWine, groundCoffee, instantCoffee};
        for (int i = 0; i < allProducts.length; i++) {

        }

        System.out.println("all products: " + Arrays.toString(allProducts));

    }
}