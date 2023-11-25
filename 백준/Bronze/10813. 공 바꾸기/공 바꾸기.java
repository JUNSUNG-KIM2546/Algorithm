import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	 public static void main(String[] args) throws Exception {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    String input = br.readLine(); // 배열에 입력될 값
	    StringTokenizer st = new StringTokenizer(input, " ");
	    
	    int N = Integer.parseInt(st.nextToken()); // 입력받는 배열의 크기
	    int[] list = new int[N];	// list라는 배열에 N만큼 할당
	    int L = Integer.parseInt(st.nextToken()); // 입력받는 횟수(반복횟수)
	    
	    for(int n=0; n < list.length; n++) {
	    	list[n] = n+1;
	    }
	    
	    for(int i=0; i<L; i++) {
	    	input = br.readLine(); // 배열에 입력될 값
		    st = new StringTokenizer(input, " ");
	        int S = Integer.parseInt(st.nextToken());
	        int A = Integer.parseInt(st.nextToken());
	        
	        int temp = list[S-1];
	        list[S-1] = list[A-1];
	        list[A-1] = temp;
	    }
	    
	    for(int j=0; j<N; j++) {
	    	bw.write(Integer.toString(list[j]));
    		bw.write(" "); // 할당
	    }
	    
	    bw.flush();
	    bw.close();
	    br.close();
	}
}