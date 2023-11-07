import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int A;
		int B;
		A = sc.nextInt();
		B = sc.nextInt();
		
		String b = Integer.toString(B);
		String b3 = b.substring(2);
		String b2 = b.substring(1,2);
		String b1 = b.substring(0,1);
		
		int B3 = Integer.parseInt(b3);
		int B2 = Integer.parseInt(b2);
		int B1 = Integer.parseInt(b1);
		
		
		System.out.println( A*B3 );
		System.out.println( A*B2 );
		System.out.println( A*B1 );
		System.out.println( A * B );
    }
}