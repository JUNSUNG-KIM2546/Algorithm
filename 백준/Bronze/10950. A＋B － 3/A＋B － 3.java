import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int co = sc.nextInt();
        
        
        for(int i=0; i<co; i++) {
        	int A = sc.nextInt();
            int B = sc.nextInt();
            int total = A + B;
            System.out.println(total);
        }
	}
}