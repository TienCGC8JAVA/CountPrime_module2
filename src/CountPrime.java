import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter is your number: ");
        int number = scanner.nextInt();
        int count = 0;
        int j = 1;

        while (count <= number) {
            boolean isPrime = false;
            if (j == 2 || j == 3) isPrime = true;
            else {
                for(int i = 2; i <= Math.sqrt(j); i++) {
                    if (j % i == 0) {
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                    }
                }
            }

            if (isPrime) {
                System.out.println(j + " is Prime!");
                count++;
            }
            j++;
        }
    }
}
