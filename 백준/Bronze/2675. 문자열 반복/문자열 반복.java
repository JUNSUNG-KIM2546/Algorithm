import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	 public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
		int co = Integer.parseInt(br.readLine());
		String li;
		
		for(int i=0; i<co; i++) {
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input, " ");	// 토큰라이저
			int c = Integer.parseInt(st.nextToken());
			li = st.nextToken();
			String[] re = li.split("");	// 문자열을 "" 기준으로 짤라서(한 문자씩) re배열에 넣는다
			
			for(int j=0; j<re.length; j++) {
				bw.write(re[j].repeat(c));
			}
			bw.newLine();
		}
	    bw.flush();
	    bw.close();
	    br.close();
	}
}