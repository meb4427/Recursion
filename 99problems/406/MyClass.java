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

class Invoice {
    String invoiceNumber;
    InvoiceItem invoiceItemHead;

    public Invoice(String invoiceNumber, InvoiceItem invoiceItemHead) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceItemHead = invoiceItemHead;
    }

    public double amountDue(boolean taxes) {
        double total = 0;
        InvoiceItem current = this.invoiceItemHead;
        while (current != null) {
            total += current.getTotalPrice();
            current = current.next;
        }
        if (taxes) {
            return total * 1.1;
        } else {
            return total;
        }
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

        Invoice invoice = new Invoice("UC1234567890", firstItem);

        System.out.println((int) invoice.amountDue(false));
        System.out.println(invoice.amountDue(true));
    }
}