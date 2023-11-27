import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	 public static void main(String[] args) throws Exception {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    boolean[] list = new boolean[31];	// list1라는 배열에 지정한만큼 할당
	     list[0] = true;
	    
	    
	    for(int i=0; i<28; i++) {
	    	int B = Integer.parseInt(br.readLine());
	    	list[B] = true;
	    }
	    
	    for(int i=0;i<list.length;i++) {
	    	if(list[i] == false) {
	    		bw.write(Integer.toString(i));
	    		bw.newLine();
	    	}
	    }
		
	    bw.flush();
	    bw.close();
	    br.close();
	}
}