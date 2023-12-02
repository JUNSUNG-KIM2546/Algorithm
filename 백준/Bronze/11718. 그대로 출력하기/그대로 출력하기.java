import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	 public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    String input = "";
		
		while ( (input = br.readLine()) != null && !input.isEmpty() ) {	// 컨트롤 +z 가 멈춤(EOF) = 값을 그만 넣는다
		//while ( (input = br.readLine()) != null ) {	// 컨트롤 +z 가 멈춤(EOF) = 값을 그만 넣는다
			
			if ((input.equals(""))) {
				bw.close(); //종료
				break;
			}
			else {
				bw.write(input);	// 버퍼는 스트링으로 받아서 스트링으로 출력 해야한다
				bw.newLine();	// 개행 줄 추가
			}
		}
		
	    bw.flush();
	    bw.close();
	    br.close();
	}
}