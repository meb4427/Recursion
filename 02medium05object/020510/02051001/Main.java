class DownloadableProduct {
    public String title;
    public String description;
    public double price;
    public double sizeMb;
    public String extension;

    public DownloadableProduct(String title, String description, double price, double sizeMb, String extension) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.sizeMb = sizeMb;
        this.extension = extension;
    }

    public double getFinalPrice(Tax tax) {
        return this.price * (1 + tax.federalTax + tax.stateTax + tax.localTax);
    }
}

class Tax {
    public String name;
    public double federalTax;
    public double stateTax;
    public double localTax;

    public Tax(String name, double federalTax, double stateTax, double localTax) {
        this.name = name;
        this.federalTax = federalTax;
        this.stateTax = stateTax;
        this.localTax = localTax;
    }
}

class Main {
    public static void main(String[] args) {
        DownloadableProduct product1 = new DownloadableProduct("A hero returns - Remastered", "A movie about a hero who saves the world.", 23.5, 13000, "mp4");
        
        System.out.println(product1.title);
        System.out.println(product1.description);

        Tax taxLasVegas = new Tax("Las Vegas Taxes", 0.02,0.05,0.01);
        System.out.println(product1.title + "'s price is: " + product1.price);
        System.out.println(product1.title + "'s final price for " + taxLasVegas.name + " is: " + product1.getFinalPrice(taxLasVegas));
    }
}
