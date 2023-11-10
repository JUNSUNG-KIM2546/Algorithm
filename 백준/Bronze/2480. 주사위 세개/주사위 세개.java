import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        long total = 0;
        
        if( ((1<=A)&&(A<=6)) && ((1<=B)&&(B<=6)) && ((1<=C)&&(C<=6)) ) {
        	if( (A == B) && (B == C) ) {
        		total = 10000 + (A*1000);
        	}
        	else if( (A == B) || (A == C) || (B == C) ) {
        		if(A == B)
        			total = 1000 +  A * 100;
        		else if(B == C)
        			total = 1000 +  B * 100;
        		else if(A == C)
        			total = 1000 +  C * 100;
        	}
        	else {
        		total = Math.max(Math.max(A, B), C) * 100;
        	}
        	System.out.println(total);
        }
        else {
        	System.out.println("입력이 잘못되었습니다.");
        }
	}
}