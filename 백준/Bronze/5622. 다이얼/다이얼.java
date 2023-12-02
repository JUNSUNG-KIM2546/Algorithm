import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	 public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    // ABC=3 / DEF=4 / GHI=5 / JKL=6 / MNO=7 / PQRS=8 / TUV=9 / WXYZ=10
	    
	    String input = br.readLine();
	    int result = 0;
		
	    for(int i=0; i<input.length(); i++) {
	    	switch (input.charAt(i)) {
			case 'A': case 'B': case 'C':
				result += 3;
				break;
				
			case 'D': case 'E': case 'F':
				result += 4;
				break;
				
			case 'G': case 'H': case 'I':
				result += 5;
				break;
				
			case 'J': case 'K': case 'L':
				result += 6;
				break;
				
			case 'M': case 'N': case 'O':
				result += 7;
				break;
				
			case 'P': case 'Q': case 'R': case 'S':
				result += 8;
				break;
				
			case 'T': case 'U': case 'V':
				result += 9;
				break;
				
			default:
				result += 10;
				break;
			}
	    }
		
		bw.write(Integer.toString(result));
		bw.newLine();
			
	    bw.flush();
	    bw.close();
	    br.close();
	}
}