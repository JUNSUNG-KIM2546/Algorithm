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
	    double tot = 0;
	    
	    double[] list = new double[Integer.parseInt(input)];	// list1 배열 할당
	    
	    input = br.readLine();
	    StringTokenizer st = new StringTokenizer(input, " ");	// 토큰라이저
	    
	    for(int i=0; i<list.length; i++) {	// 리스트에 점수 할당
	    	int C = Integer.parseInt(st.nextToken());
	    	list[i] = C;
	    }
	    
	    double ma = list[0];	// 최고점수 초기선언
	    
	    for(int i=0; i<list.length; i++) {
    		ma = Math.max(list[i], ma);
	    }
	    
	    for(int i=0;i<list.length;i++) {
	    	list[i] = (list[i]/ma)*100;
	    	tot += list[i];
	    	
	    }
	    
	    double result = tot / list.length;
	    
	    bw.write(Double.toString(result));
    	bw.write(" ");
	    //bw.write(Integer.toString(list[]));	// result배열 크기를 출력
	    //bw.write(Arrays.toString(list));	// result 리스트를 통으로 출력
	    bw.flush();
	    bw.close();
	    br.close();
	}
}