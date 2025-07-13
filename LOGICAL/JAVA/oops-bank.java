class Scratch {
    public static void main(String[] args) {
        //create object
        KhushalBank k = new KhushalBank("Khushi");
        k.credit(4000);
        k.balance();
        k.credit(500);
        k.balance();
        k.credit(11000);
        k.balance();
        k.withdrawl(4000);
        k.balance();
        k.credit(3400);
        k.balance();
        k.withdrawl(100);
        k.balance();
        k.withdrawl(50);
        k.balance();


        KhushalBank s = new KhushalBank("Samiksha");
        s.credit(1000);
        k.balance();
        s.credit(4000);
        s.balance();
        s.withdrawl(200);
        s.balance();
        s.withdrawl(1341);
        s.balance();
        s.credit(5000);
        s.balance();
        s.credit(1005);
        s.balance();
        s.credit(3410);
        s.balance();
    }
}

class KhushalBank {
    float money = 0;
    String name;
    //constructor
    KhushalBank(String customerName) {
        name = customerName;
        System.out.println("Welcome to Khushal Bank!");
        System.out.println("Welcome to Khushyali!...");
    }
    //To credit money to account
    void credit(float amount){
        money = money + amount;
    }
    //to withdraw money
    void withdrawl(float amount){
        money = money - amount;
    }
    //To display the customer name and balance
    void balance(){
        System.out.println("Hello "+name);
        System.out.println("Your Balance is "+money);
    }
}