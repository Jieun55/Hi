import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];
        int max = 100000;
        int min = -1000000;
        for(int k=0; k<count;k++) {
        	arr[k] = scanner.nextInt();
        	if(arr[k] < max)
        		max = arr[k];
        	if(arr[k] > min)
        		min = arr[k];
        	}
        System.out.print(max + " " + min);
        scanner.close();
	}
}
