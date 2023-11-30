import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	 public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    int co = Integer.parseInt(br.readLine());
	    
	    for(int i=0; i<co; i++) {
	    	String input = br.readLine();
	    	bw.write(input.charAt(0));
	    	bw.write(input.charAt(input.length()-1));
	    	bw.newLine();
	    }
	    
	    bw.flush();
	    bw.close();
	    br.close();
	}
}