import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long A,B,C,D;
		
		A = sc.nextLong();
		B = sc.nextLong();
		C = sc.nextLong();
		D = A+B+C;
		
		System.out.println( D );
	}
}