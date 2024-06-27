class BankAccount {
    String BankAccount;
    String ownerName;
    int savings;

    public BankAccount(String BankAccount, String ownerName, int savings) {
        this.BankAccount = BankAccount;
        this.ownerName = ownerName;
        this.savings = savings;
    }

    public int depositMoney(int depositAmount) {
        if (this.savings <= 20000) {
            this.savings += depositAmount - 100;
        } else {
            this.savings += depositAmount;
        }
        return this.savings;
    }

    public int withdrawMoney(int withdrawAmount) {
        if (withdrawAmount > 0.2 * this.savings) {
            this.savings -= 0.2 * this.savings;
            return this.savings;
        } else {
            this.savings -= withdrawAmount;
            return this.savings;
        }
    }

    public double pastime(int days) {
        double tempSavings = this.savings + 0.25 * days;
        return tempSavings;
    }
}

class MyClass {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("Chase", "Claire Simmmons", 30000);
        System.out.println(user1.withdrawMoney(2000));
        System.out.println(user1.depositMoney(10000));
        System.out.println(user1.pastime(93));
    
        BankAccount user2 = new BankAccount("Bank Of America", "Remy Clay", 10000);
        System.out.println(user2.withdrawMoney(5000));
        System.out.println(user2.depositMoney(12000));
        System.out.println(user2.pastime(505));
    }
}
