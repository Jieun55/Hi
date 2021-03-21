import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int num = 0;
        for(int k=0; k<arr.length;k++) {
        	arr[k] = scanner.nextInt();
        	if (arr[k] > max)
        		max = arr[k];
        	if (max == arr[k])
        		num = k + 1;
        }
        System.out.println(max + "\n" + num);
        scanner.close();
	}
}
