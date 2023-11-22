import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	 public static void main(String[] args) throws Exception {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int ma = -1000000;
	    int mi = 1000000;
	    
	    
	    int N = Integer.parseInt(br.readLine()); // 입력받는 배열의 크기
	    int[] list = new int[N];
	    
	    String input = br.readLine(); // 배열에 입력될 값
	    StringTokenizer st = new StringTokenizer(input, " ");
	    
	    for(int i=0; i<list.length; i++) {
	        list[i] = Integer.parseInt(st.nextToken());
	    }
	    
	    for(int tot : list) {
    		ma = Math.max(tot, ma);
    		mi = Math.min(tot, mi);
	    }
	    bw.write(Integer.toString(mi));
		bw.write(" ");
		bw.write(Integer.toString(ma));
	    bw.flush();
	    bw.close();
	    br.close();
	}
}