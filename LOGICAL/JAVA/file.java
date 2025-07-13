import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        float num = scanner.nextFloat();
        float sum = num + num;
        System.out.println("Float Value is:" +sum);
    }
}
