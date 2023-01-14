public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25, false);
        Person person2 = new Person("Jane", 30, true);
        Person person3 = new Person("Bob", 35, false);

        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge() + ", Married: " +person1.isMarried());
        System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge() + ", Married: " + person2.isMarried());
        System.out.println("Name: " + person3.getName() + ", Age: " + person3.getAge() + ", Married: " + person3.isMarried());

        Product product1 = new Product("Apple", 0.5, 10, "Fruit");
        Product product2 = new Product("Computer", 1000, 2, "Electronics");
        Product product3 = new Product("Shampoo", 5, 20, "Personal Care");

        System.out.println("Product 1: " + product1.getName() + ", Price: $" + product1.getPrice() + ", Quantity: " + product1.getQuantity() + ", Category: " + product1.getCategory());
        System.out.println("Has stock: " + product1.hasStock());
        System.out.println("Is category 'Fruit': " + product1.isCategory("Fruit"));

        System.out.println("Product 2: " + product2.getName() + ", Price: $" + product2.getPrice() + ", Quantity: " + product2.getQuantity() + ", Category: " + product2.getCategory());
        System.out.println("Has stock: " + product2.hasStock());
        System.out.println("Is category 'Electronics': " + product2.isCategory("Electronics"));

        System.out.println("Product 3: " + product3.getName() + ", Price: $" + product3.getPrice() + ", Quantity: " + product3.getQuantity() + ", Category: " + product3.getCategory());
        System.out.println("Has stock: " + product3.hasStock());
        System.out.println("Is category 'Personal Care': " + product3.isCategory("Personal Care"));

        Bottle bottle1 = new Bottle(1);
        System.out.println("Has more liquid: " + bottle1.hasMoreLiquid());
        System.out.println("Available liquid: " + bottle1.getAvailableLiquid() + "L");
        System.out.println("Empty capacity: " + bottle1.getEmptyCapacity() + "L");
        bottle1.open();
        bottle1.drink(0.5);
        System.out.println("Available liquid: " + bottle1.getAvailableLiquid() + "L");
        bottle1.close();
        bottle1.drink(0.5);
        System.out.println("Available liquid: " + bottle1.getAvailableLiquid() + "L");
        bottle1.open();
        bottle1.drink(0.5);
        System.out.println("Available liquid: " + bottle1.getAvailableLiquid() + "L");
        bottle1.open();
    }
}

