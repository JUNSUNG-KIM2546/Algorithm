import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int total = 0;
        
        for(int i=0; i<=A; i++) {
            total += i;
        }
        System.out.println(total);
	}
}