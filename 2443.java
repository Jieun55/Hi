import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int n, m, k;
        for (n=0; n<i; n++) {
        	for(k=0; k<n;k++)
        		System.out.print(" ");
        	for(m=0; m<2*i-2*n-1; m++)
        		System.out.print("*");
        		System.out.println();
        }
    }
}
