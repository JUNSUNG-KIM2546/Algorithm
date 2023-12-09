import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	 public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    // 첫째 줄 입력 받기
	    String input[] = br.readLine().split(" ");
	    
	    // 입력 받은 값 지정
	    String result = input[0];
	    int resultCo = Integer.parseInt(input[1]);
	    
	    // 입력 받은 result값, resultCo값을 10진수로 변환 하여 re에 넣기
	    int re = Integer.parseInt(result, resultCo);
	    
	    // 답 할당
		bw.write(Integer.toString(re));
		
		// 답 출력
		bw.flush(); //출력
		bw.close(); //종료
	}
}