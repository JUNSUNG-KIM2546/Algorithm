import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	 public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    String input = br.readLine();
		
		StringTokenizer st = new StringTokenizer(input, " ");	// 토큰라이저
		
		StringBuffer A = new StringBuffer(st.nextToken());	// 입력 받은 문자열을 스트링버퍼로 변환
		StringBuffer B = new StringBuffer(st.nextToken());
		
		String a = A.reverse().toString();	// 값을 뒤집어 준다 (리버스)
		String b = B.reverse().toString();
		
		int aa = Integer.parseInt(a);	// 뒤집어 준 값을 int형으로 변경
		int bb = Integer.parseInt(b);
		
		int re = Math.max(aa, bb);	// 뒤집어진 int형을 서로 비교해서 큰수를 뽑아줌
		
		bw.write(Integer.toString(re));
		bw.newLine();
			
	    bw.flush();
	    bw.close();
	    br.close();
	}
}