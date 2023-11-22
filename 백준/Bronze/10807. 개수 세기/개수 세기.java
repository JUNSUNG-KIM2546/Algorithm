import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//인풋
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	//아웃풋
		String a = "";
		String b = "";
		String c = "";
		int count = 0;
		a = br.readLine();
		int i = Integer.parseInt(a);
		int[] list = new int[i];
		
		b = br.readLine();
		StringTokenizer st = new StringTokenizer(b, " ");
		for(int j=0; j<list.length; j++) {
			list[j] = Integer.parseInt(st.nextToken());
		}
		c = br.readLine();
		int cc = Integer.parseInt(c);
		for(int ce : list) {
			if(cc == ce) {
				count++;
			}
		}
		
		bw.write(Integer.toString(count));	// 버퍼는 스트링으로 받아서 스트링으로 출력 해야한다
		bw.newLine();	// 개행 줄 추가
		bw.flush(); //출력
		br.close(); //종료
		bw.close(); //종료
		
	}
}