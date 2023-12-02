import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	 public static void main(String[] args) throws Exception {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String input = br.readLine();
			
			if(!input.equals(" ")) {
				String[] re = input.trim().split(" ");
				bw.write(Integer.toString(re.length));
			}
			else {
				bw.write(Integer.toString(0));
			}
			// input.trim() 이걸로 양쪽 공백을 제거
			// split(" ")문자열을 " " 기준으로 짤라서(한 문자씩) re배열에 넣는다
			
			bw.newLine();
		    bw.flush();
		    bw.close();
		    br.close();
	}
}