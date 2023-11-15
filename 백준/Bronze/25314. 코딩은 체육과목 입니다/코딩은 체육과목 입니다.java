import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int j = a /4;
		String lo = "long ";
		for(int i=0; i<j; i++) {
			System.out.print(lo);
		}
		System.out.print("int");
		
	}
}