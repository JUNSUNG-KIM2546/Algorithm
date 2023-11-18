import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//인풋
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	//아웃풋
		String s = br.readLine();
		
		int co = Integer.parseInt(s);	// 스트링을 인트로 변환
		for(int i=0; i<co; i++) {
			String t = br.readLine();
			StringTokenizer st = new StringTokenizer(t, " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int ab =  A+B;	// 스트링을 인트로 변환(계산)
			bw.write("Case #");
			bw.write(Integer.toString(i+1));
			bw.write(": ");
			bw.write(Integer.toString(A));
			bw.write(" + ");
			bw.write(Integer.toString(B));
			bw.write(" = ");
			bw.write(Integer.toString(ab));	// 버퍼는 스트링으로 받아서 스트링으로 출력 해야한다
			bw.newLine();	// 개행 줄 추가
		}
		bw.flush(); //출력
		bw.close(); //종료
	}
}