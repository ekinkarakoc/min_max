import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Kaç sayı gireceksiniz: ");
            int N = scanner.nextInt();

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < N; i++) {
                System.out.print("Sayı " + (i + 1) + ": ");
                int number = scanner.nextInt();

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }
            }

            System.out.println("En küçük sayı: " + min);
            System.out.println("En büyük sayı: " + max);


        }

}