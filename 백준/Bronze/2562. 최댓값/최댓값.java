import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	 public static void main(String[] args) throws Exception {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int ma = 0;
	    int in = 0;
	    
	    int[] list = new int[9];
	    
	    for(int i=0; i<list.length; i++) {
	    	list[i] = Integer.parseInt(br.readLine());
	    	if(list[i] > ma) {
	    		ma = Math.max(list[i], ma);
	    		in = i;
	    	}
	    }
	    
		bw.write(Integer.toString(ma));
		bw.newLine(); // 줄바꿈
		bw.write(Integer.toString(in + 1));
	    bw.flush();
	    bw.close();
	    br.close();
	}
}