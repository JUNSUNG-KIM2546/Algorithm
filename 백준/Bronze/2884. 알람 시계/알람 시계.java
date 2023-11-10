import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int tm = 60;
        
        if( ((0<=H)&&(H<=23)) && ((0<=M)&&(M<=59)) ) {
        	if(45 <= M) {
        		M = M - 45;
        		System.out.println(H + " " + M);
        		
        	} else {
        		if(H == 0) {
        			H = 23;
            		M = (M + tm) - 45;
            		System.out.println(H + " " + M);
        		}else {
            		H--;
            		M = (M + tm) - 45;
            		System.out.println(H + " " + M);
        		}
        	}
        }else {
        	System.out.println("입력이 잘못되었습니다.");
        }
	}
}