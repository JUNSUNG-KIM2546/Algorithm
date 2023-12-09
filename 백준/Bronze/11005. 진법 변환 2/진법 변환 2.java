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
	    int result = Integer.parseInt(input[0]);	//10진수 값
	    int resultCo = Integer.parseInt(input[1]);	// 변경할 진법
	    
	    // 입력 받은 result값, resultCo값을 진법에 맞게 변환 하여 re에 넣기
	    String re = Integer.toString(result, resultCo).toUpperCase();
	    
	    // 답 할당
		bw.write(re);
		
		// 답 출력
		bw.flush(); //출력
		bw.close(); //종료
	}
}