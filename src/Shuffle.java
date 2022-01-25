import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {

        System.out.print("\n");

        Product coconutMilk = new Product("Aroy-D ",190.0," 1L ", Category.MILK);
        Product soyaMilk = new Product("Alpro ", 80.0, " 1L ", Category.MILK);
        Product sparklingWine = new Product("Veuve Clicquot ", 1090.0, " 0.375 ", Category.WINE);
        Product whiteWine = new Product("Marlborough Sun ", 380.0, " 0.75 ", Category.WINE);
        Product groundCoffee = new Product("Illy ", 222.0, " 0.25KG ", Category.COFFEE);
        Product instantCoffee = new Product("Jacobs ", 125.0, " 0.19KG ", Category.COFFEE);

        Product [] allProducts = {coconutMilk, soyaMilk, sparklingWine, whiteWine, groundCoffee, instantCoffee};
        Product [] milk = new Product[allProducts.length];
        Product [] wine = new Product[allProducts.length];
        Product [] coffee = new Product[allProducts.length];

        int priceLessThan100 = 0;
        int nameWithParticleAr = 0;

        for (int i = 0; i < allProducts.length; i++) {

            if (allProducts[i].getCategory().equals(Category.MILK)){
                milk[i] = allProducts[i];
            }
            if (allProducts[i].getCategory().equals(Category.WINE)){
                wine[i] = allProducts[i];
            }
            if (allProducts[i].getCategory().equals(Category.COFFEE)){
                coffee[i] = allProducts[i];
            }
            if (allProducts[i].getPrice() < 100) {
                priceLessThan100 = priceLessThan100 + 1;
            }
            if (allProducts[i].getName().matches("(.*)Ar(.*)")) {
                nameWithParticleAr = nameWithParticleAr + 1;
            }

        }

        System.out.println("all products: " + Arrays.toString(allProducts));
        System.out.print("\n");
        System.out.println("milk: " + Arrays.toString(milk));
        System.out.print("\n");
        System.out.println("wine: " + Arrays.toString(wine));
        System.out.print("\n");
        System.out.println("coffee: " + Arrays.toString(coffee));
        System.out.print("\n");
        System.out.println("price less than 100: " + priceLessThan100);
        System.out.print("\n");
        System.out.println("name with particle 'Ar': " + nameWithParticleAr);

    }
}