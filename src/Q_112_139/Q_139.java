package Q_112_139;

public class Q_139 {
}
    class Product{
        double price;
    }
    class Test139 {

        public void updatePrice(Product product, double price) {
        price = price * 2;
        product.price = product.price + price;
    }

    public static void main(String[] args) {
        Product prt = new Product();
        prt.price=200;
        double newPrice = 100;

        Test139 t = new Test139();
        t.updatePrice(prt, newPrice);
        System.out.println(prt.price + "  :  " + newPrice);
    }
}

/*
What is the result?
 A. 200.0 : 100.0
B. 400.0 : 200.0
C. 400.0 : 100.0
D. Compilation fails.

Answer: C

2. kaynakta ayni sekilde sorulmus
 */
