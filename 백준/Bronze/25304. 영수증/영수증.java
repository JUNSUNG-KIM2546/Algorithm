import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int co = sc.nextInt();
		int tot = 0;
		for(int i=0; i<co; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int to = a *b;
			tot += to;
		}
		if(tot == sum) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}