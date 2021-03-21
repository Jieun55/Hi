import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];
        int max = 0; double avg = 0.0; int sum = 0;
        for(int k=0; k<count;k++) {
        	arr[k] = scanner.nextInt();
        	if (arr[k] > max)
        		max = arr[k];
        	sum += arr[k];
        	}
        avg =  100.0 * sum / max / count;
        System.out.println(avg);
        scanner.close();
	}
}
