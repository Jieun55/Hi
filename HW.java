import java.util.Scanner;
public class Fraction {
	 int numerator;
	 int denominator;
	 
	public Fraction() {
		numerator = 1; denominator = 1;
	} //분자와 분모를 1로 지정하는 생성자
	
	public Fraction(int d) {
		numerator = 1; denominator = d;
	} // 분자는 1로 지정, 분모는 d로 지정하는 생성자
	
	public Fraction(int n, int d) { 
		numerator = n; denominator = d;
	} // 분자는 n, 분모는 d로 지정하는 생성자
	
	public void addFraction(Fraction n, Fraction m) {
		m.numerator=(numerator*n.denominator)+(n.numerator*denominator);
		m.denominator=denominator*n.denominator;
	} // 덧셈 메소드
	
	public void subFraction(Fraction n, Fraction m) {
		m.numerator=(numerator*n.denominator)-(n.numerator*denominator);
		m.denominator=denominator*n.denominator;
	} // 뺼셈 메소드
	
	public void mulFraction(Fraction n, Fraction m) {
		m.numerator=numerator*n.numerator;
		m.denominator=denominator*n.denominator;
	} // 곱셈 메소드
	
	public void divFraction(Fraction n, Fraction m) {
		m.numerator=numerator*n.denominator;
		m.denominator=denominator*n.numerator;
	} // 나눗셈 메소드
	
	public void reduction() {
		int gcd = 0;
		if(numerator > denominator) {
			for(int i = 1; i<= denominator; i++) {
				if((numerator % i == 0) && (denominator % i == 0)) {
					gcd = i;
					}
				}
		numerator /= gcd;
		denominator /= gcd;
		} // 분자가 분모보다 클 때
		else if (numerator == denominator) {
			numerator = denominator = 1;
			} // 분자와 분모가 같을 때
		else {
			for(int i = 1; i<=numerator; i++) {
				if((numerator % i ==0) && (denominator % i == 0)) {
					gcd = i;
				}
			}
			numerator /= gcd;
			denominator /= gcd;
		} // 분모가 분자보다 클 때
	} // 약분 메소드
	
	public void printFraction() {
		System.out.println(numerator + "/" + denominator);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분수1(분자 분모) 입력: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Fraction num1 = new Fraction(a,b);

		System.out.println("분수2(분자 분모) 입력: ");
		int c = sc.nextInt();
		int d = sc.nextInt();
		Fraction num2 = new Fraction(c,d);
		
		Fraction result = new Fraction();
		System.out.println("--------------------------------");
		num1.addFraction(num2, result);
		result.reduction();
		System.out.print(a+"/"+b+"+"+c+"/"+d+"=");result.printFraction();
		
		num1.subFraction(num2, result);
		result.reduction();
		System.out.print(a+"/"+b+"-"+c+"/"+d+"=");result.printFraction();
		
		num1.mulFraction(num2, result);
		result.reduction();
		System.out.print(a+"/"+b+"x"+c+"/"+d+"=");result.printFraction();
		
		num1.divFraction(num2, result);
		result.reduction();
		System.out.print(a+"/"+b+"/"+c+"/"+d+"=");result.printFraction();
		sc.close();
	}
}
