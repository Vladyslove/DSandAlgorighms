package chap1_Overview;


class BankAccount {
    private double balance;

    BankAccount(double openingBalance) {
        balance = openingBalance;
    }

    void deposit (double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    void display() {
        System.out.println("balance = " + balance);
    }

}

class BankApp {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(99.99);

        System.out.println("Before transactions balance: ");
        bankAccount.display();

        bankAccount.deposit(11.11);
        bankAccount.withdraw(22.22);
        System.out.println("After transactions balance: ");
        bankAccount.display();


        // Equality and Identity

        /*the equality operator (==) tell
        whether two variables have the same value:*/
        int a = 10;
        int b = a;
        if (a == b) {
            System.out.println("They are equal");
        }


        /*The equality operator, when
        applied to objects, tells whether two references
        are identical—that is, whether
        they refer to the same object:*/
        BankAccount bankAccount2 = bankAccount;
        if (bankAccount == bankAccount2) {
            System.out.println("They are Indentical");
        }

      /*  For seeing whether two objects contain
         the same data in Java, necessary to use
         equals() method of the Object class*/
        if (bankAccount.equals(bankAccount2)) {
            System.out.println("They are Equal");
        }



    }

}
