import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for (char c: a.toCharArray()) {
        	if (Character.isUpperCase(c)) {
        		c = Character.toLowerCase(c);
        	} else {
        		c = Character.toUpperCase(c);
        	}
        	System.out.print(c);
        }
    }
}