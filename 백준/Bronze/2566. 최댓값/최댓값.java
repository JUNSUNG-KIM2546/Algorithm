import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	 public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    int[][] listResult;
	    int result = 0;
	    int x = 0;
	    int y = 0;
	    
	    // 배열 크기 설정
	    listResult = new int[9][9];
	    
	    // listResult리스트에 입력 값 넣기
		for(int i=0; i<listResult.length;i++) {
			String input[] = br.readLine().split(" ");
			for(int j=0; j<listResult[i].length; j++) {
				listResult[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		// 값 비교
		for (int i=0; i< listResult.length; i++) {
			for (int j=0; j< listResult[i].length; j++) {
				if(result <= listResult[i][j]) {
					result = listResult[i][j];
					x = i+1;
					y = j+1;
				}
			}
		}
		
		// 답 출력
		System.out.println(result);
		System.out.print(x + " " + y);
	}
}