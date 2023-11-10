import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if(((-1000 <= x)&&(-1000 <= y)) && ((x <= 1000)&&(y <= 1000)) && ((x != 0)&&(y != 0)) ) {
        	if(( 0 < x )&&( 0 < y )) {
            	System.out.println(1);
            } else if(( x < 0 )&&( 0 < y )) {
            	System.out.println(2);
            } else if(( x < 0 )&&( y < 0 )) {
        		System.out.println(3);
        	} else {
        		System.out.println(4);
        	}
        }
        else {
        	System.out.println("입력이 잘못되었습니다.");
        }
	}
}