import java.util.Scanner;

public class BJ_5073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;

        while(true) {
            int side1 = scanner.nextInt();
            int side2 = scanner.nextInt();
            int side3 = scanner.nextInt();

            if (side1 > side2) { // side1이 가장 클 때
                if (side1 > side3) {
                    max = side1;
                }
                else
                    max = side3; // side3가 가장 클 때
            }
            else  //side2가 가장 클
                max = side2;


        }

        scanner.close();
    }
}
