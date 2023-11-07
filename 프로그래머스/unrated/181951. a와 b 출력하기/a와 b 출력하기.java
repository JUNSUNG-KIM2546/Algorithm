import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if( (-100000<=a && a<=100000) && (-100000<=b && b<=100000) ){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        else {
            System.out.println("입력이 잘못되었습니다.");
        }
            
    }
}