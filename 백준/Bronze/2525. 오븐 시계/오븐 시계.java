import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = 0;
        
        if( ((0<=A)&&(A<=23)) && ((0<=B)&&(B<=59)) && ((0<=C)&&(C<=1000)) ) {
        	if(60 <= C) {
        		if(A == 23) {
            		B += C;
            		A += B / 60;
            		if(24 <= A) {
            			A = A % 24;
            		}
            		if(60 <= B) {
            			B = B % 60;
            		}
            		System.out.println(A + " " + B);
        		}else {
            		B += C;
            		A += B / 60;
            		if(24 <= A) {
            			A = A % 24;
            		}
            		if(60 <= B) {
            			B = B % 60;
            		}
            		System.out.println(A + " " + B);
        		}
        	} else {
        		if(A == 23) {
            		B += C;
            		A += B / 60;
            		if(24 <= A) {
            			A = A % 24;
            		}
            		if(60 <= B) {
            			B = B % 60;
            		}
            		System.out.println(A + " " + B);
        		}else {
        			B += C;
            		A += B / 60;
            		if(24 <= A) {
            			A = A % 24;
            		}
            		if(60 <= B) {
            			B = B % 60;
            		}
            		System.out.println(A + " " + B);
        		}
        	}
        }else {
        	System.out.println("입력이 잘못되었습니다.");
        }
	}
}