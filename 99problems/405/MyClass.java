class Product {
    String title;
    int price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }
}

class InvoiceItem {
    Product product;
    int quantity;
    public InvoiceItem next;

    public InvoiceItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.next = null;
    }

    public double getTotalPrice() {
        return this.product.price * this.quantity;
    }
}

class MyClass {
    public static void main(String[] args) {
        Product product1 = new Product("shampoo", 10);
        Product product2 = new Product("conditioner", 5);
        Product product3 = new Product("tooth brush", 3);

        InvoiceItem firstItem = new InvoiceItem(product1, 7);
        InvoiceItem secondItem = new InvoiceItem(product2, 9);
        InvoiceItem thirdItem = new InvoiceItem(product3, 10);

        firstItem.next = secondItem;
        secondItem.next = thirdItem;

        System.out.println((int) firstItem.getTotalPrice());
        System.out.println((int) secondItem.getTotalPrice());
        System.out.println((int) firstItem.next.getTotalPrice());
        System.out.println((int) firstItem.next.next.getTotalPrice());
        System.out.println(firstItem.next.product.price);
        System.out.println(firstItem.next.next.product.title);
    }
}
