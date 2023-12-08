import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	 public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    String[][] listResult;
	    String result = "";
	    
	    // 배열 크기 설정
	    listResult = new String[5][15];
	    
	    // listResult리스트에 입력 값 넣기
		for(int i=0; i<listResult.length;i++) {
			String input[] = br.readLine().split("");
			for(int j=0; j<listResult[i].length; j++) {
				if(j < input.length)
					listResult[i][j] = input[j];
				else
					listResult[i][j] = " ";
			}
		}
		
		// 값 할당
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				result += listResult[j][i].replaceAll(" ", "");
			}
		}
		bw.write(result);
		
		// 답 출력
		bw.flush(); //출력
		bw.close(); //종료
	}
}