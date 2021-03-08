import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int i, k;
        for(i=0; i<a; i++) {
        	for(k=0; k<=i; k++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        scanner.close();
	}
}
