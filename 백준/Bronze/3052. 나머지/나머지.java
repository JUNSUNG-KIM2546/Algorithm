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
	    
	    int[] list1 = new int[10];	// list1 배열 할당
	    
	    for(int i=0; i<list1.length; i++) {
	    	list1[i] = Integer.parseInt(br.readLine()) % 42;
	    }
	    Arrays.sort(list1);	// list1 오림차순
	    
	    // 배열의 중복 제거 (배열을 stream 객체화 후 중복제거)
	    int result[] = Arrays.stream(list1).distinct().toArray();
	    
	    bw.write(Integer.toString(result.length));	// result배열 크기를 출력
	    //bw.write(Arrays.toString(result));	// result 리스트를 통으로 출력
	    bw.flush();
	    bw.close();
	    br.close();
	}
}