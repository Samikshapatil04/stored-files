import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();

        if (num==0){
            System.out.println("The Number is zero number");
        }
        else if (num<0){
            System.out.println("The Number is negative number");
        }else{
            System.out.println("The Number is is Positive number");
        }


        scanner.close();
    }
}

// function calling another function caled recursion
