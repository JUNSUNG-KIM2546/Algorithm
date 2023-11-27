import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	 public static void main(String[] args) throws Exception {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    String input = br.readLine();
	    StringTokenizer st = new StringTokenizer(input, " ");	// 토큰라이저
	    
	    int[] list = new int[Integer.parseInt(st.nextToken())];	// list1 배열 할당
	    int co = Integer.parseInt(st.nextToken());
	    
	    for(int i=0; i<list.length; i++) {
	    	list[i] = i+1;
	    }
	    Arrays.sort(list);	// list1 오림차순
	    
	    for(int i=0;i<co;i++) {
	    	input = br.readLine();
		    st = new StringTokenizer(input, " ");	// 토큰라이저
	    	int o = Integer.parseInt(st.nextToken()) - 1;
	        int t = Integer.parseInt(st.nextToken()) - 1;
	        while(o < t) {
	        	int temp = list[o];
	        	list[o++] = list[t];
	        	list[t--] = temp;
	        }
	    }
	    
	    for(int tot : list) {
	    	bw.write(Integer.toString(tot));
	    	bw.write(" ");
	    }
	    
	    bw.flush();
	    bw.close();
	    br.close();
	}
}