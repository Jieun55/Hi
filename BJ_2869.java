import java.util.Scanner;

public class BJ_2869 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int v = scanner.nextInt();
		int sum = 0, day=0;
		
		while (sum<=v) {
			sum = sum + a;
			sum = sum - b;
			day++;
		}
		System.out.print(day);
		scanner.close();
	}
}

// ��ĳ�� ���� ���۸����� �ް�, ��ūȭ�� �ɰ���
// 4 2 10�̸�, 10�� �������� ���������� ������ ���� 3��(2+2+2 + 4)
// gap