import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int num = scanner.nextInt();

        String result = (num % 4 == 0) ? "Leap Year." : "Not a Leap Year.";
        System.out.println(num + " is " + result);

        scanner.close();
    }
}
