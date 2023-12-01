import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	 public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
		int co = Integer.parseInt(br.readLine());
		String input = br.readLine();
		String list = input;
		int sum = 0;	
		
		if(list.length() == co) {
			for(int i=0; i<list.length(); i++) {
				sum += (list.charAt(i) - '0');
			}
		}
			bw.write(Integer.toString(sum));
	    	
		    bw.flush();
		    bw.close();
		    br.close();
	}
}