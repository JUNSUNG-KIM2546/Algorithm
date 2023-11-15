import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int j = 0;
		String lo = "long ";
		 j = a / 4;
		/*
		 * for(int i=4; i<=a; i++) { j = a / i; }
		 */
		System.out.print(lo.repeat(j)+ "int");
		
	}
}