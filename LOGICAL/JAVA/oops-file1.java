// 1

class Scratch {
    public static void main(String[] args){

        System.out.println("HELLO JAVA!");
        TShirt khushi = new TShirt();    //object is also a variable of class - khushi is object here
        khushi.setUserNameAndSize("Khushi", "Medium");
        khushi.displayTShirt();

    }
}
class TShirt {                  //TShirt is a class keyword
    String clientName; //
    String tShirtColor = "Blue";
    String companyLogo = "Enjoy Programming";
    String tShirtSize;
    Integer cost = 500;

    void setUserNameAndSize (String userName, String size){   //function parameter
        clientName = userName;
        tShirtSize = size;
    }

    void displayTShirt(){
        System.out.println("TShirt Belong To Student "+clientName);
        System.out.println("TShirt Belong To Company "+companyLogo);
        System.out.println("TShirt Size "+tShirtSize);
        System.out.println("TShirt Cost "+cost);
        System.out.println("TShirt Color "+tShirtColor);

    }

}





// 2
import java.util.Scanner;

class Scratch {
    public static void main(String[] args){

        System.out.println("HELLO JAVA!");
        TShirt khushi = new TShirt("Pink");//object is also a variable of class - khushi is object here
        khushi.displayTShirt();
        khushi.setUserNameAndSize("Khushi", "Medium");


        TShirt Sam = new TShirt("Green");
        Sam.setUserNameAndSize("Samiksha", "S");
        Sam.displayTShirt();
    }
}
class TShirt {                  //TShirt is a class keyword
    String clientName; ////object is also a variable of class
    String tShirtColor = "Blue";
    String companyLogo = "Enjoy Programming";
    String tShirtSize;
    Integer cost = 500;


    TShirt(String color){       //constructor                  
        System.out.println("Welcome to Enjoy Programming!");
        clientName = "Techno";
        tShirtSize = "XL";
        tShirtColor = color;
    }


    void setUserNameAndSize (String userName, String size){   //function parameter
        clientName = userName;
        tShirtSize = size;
    }

    void displayTShirt(){
        System.out.println("TShirt Belong To Student "+clientName);
        System.out.println("TShirt Belong To Company "+companyLogo);
        System.out.println("TShirt Size "+tShirtSize);
        System.out.println("TShirt Cost "+cost);
        System.out.println("TShirt Color "+tShirtColor);

    }

}


// 3
import java.util.Scanner;

class Scratch {
    public static void main(String[] args){

        System.out.println("HELLO JAVA!");
        TShirt khushi = new TShirt("Pink");//object is also a variable of class - khushi is object here
        khushi.displayTShirt();
        khushi.setUserNameAndSize("Khushi", "Medium");


        TShirt Sam = new TShirt("Green");
        Sam.setUserNameAndSize("Samiksha", "S");
        Sam.displayTShirt();
    }
}
class TShirt {                  //TShirt is a class keyword
    String clientName; //
    String tShirtColor = "Blue";
    String companyLogo = "Enjoy Programming";
    Button buttonOne, buttonTwo;
    String tShirtSize;
    Integer cost = 500;


    TShirt(String color){       //constructor
        System.out.println("Welcome to Enjoy Programming!");
        clientName = "Techno";
        tShirtSize = "XL";
        tShirtColor = color;
    }


    void setUserNameAndSize (String userName, String size){   //function parameter
        clientName = userName;
        tShirtSize = size;
    }

    void displayTShirt(){
        System.out.println("TShirt Belong To Student "+clientName);
        System.out.println("TShirt Belong To Company "+companyLogo);
        System.out.println("TShirt Size "+tShirtSize);
        System.out.println("TShirt Cost "+cost);
        System.out.println("TShirt Color "+tShirtColor);

    }

}

class button{
    String buttonType = "round";
    String buttonColor = "lightGrey";
    String materialType;

    void setMaterialType(String type){
        materialType = type;
    }

    void displayButton(){
        System.out.println("Button type = "+ buttonType + " :Button Color = "+ buttonColor);
    }
}