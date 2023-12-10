import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	 public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    // 실행 수
	    int count = Integer.parseInt(br.readLine());
	    int Q = 25;	// 쿼터 0.25
	    int D = 10;	// 다임 0.10
	    int N = 5;	// 니켈 0.05
	    int P = 1;	// 페니 0.01
	    int result = 0;
	    
	    for(int i=0; i< count; i++) {
	    	int input = Integer.parseInt(br.readLine());
	    	
	    	// 쿼터 개수
	    	bw.write(Integer.toString(input / Q));
	    	bw.write(" ");
	    	result = input % Q;
	    	
	    	// 다임 개수
	    	bw.write(Integer.toString(result / D));
	    	bw.write(" ");
	    	result %= D;
	    	
	    	// 니켈 개수
	    	bw.write(Integer.toString(result / N));
	    	bw.write(" ");
	    	result %= N;
	    	
	    	// 페니 개수
	    	bw.write(Integer.toString(result / P));
	    	bw.write(" ");
	    	result %= P;
	    	bw.newLine();
	    	
	    }
		bw.flush(); //출력
		
		br.close(); //종료
		bw.close(); //종료
	}
}