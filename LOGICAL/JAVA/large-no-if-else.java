import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second Number:");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("Entered Number " + num1 + "is Largest");
        }else{
            System.out.println("Entered Number " + num2 + "is Largest");
        }

        scanner.close();
    }
}
