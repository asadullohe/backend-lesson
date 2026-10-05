public class Product {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Foydalanish: java Product.java <mahsulot-nomi>");
            return;
        }

        String name = args[0];
        double price = 12_000.5;
        int quantity = 2;
        boolean inStock = true;
        double total = price * quantity;

        System.out.printf("""
                Mahsulot: %s
                Narx: %.2f
                Soni: %d
                Jami: %.2f
                Sotuvda: %b
                """, name, price, quantity, total, inStock);
    }
}
