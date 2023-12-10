import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	 public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		 int[][] paper = new int[100][100];
		 int count = Integer.parseInt(br.readLine());
			
		 // count 수 만큼 입력받기
		 for (int i = 0; i < count; i++) {
			 String input[] = br.readLine().split(" ");
			 int a = Integer.parseInt(input[0]); // 열 가로
			 int b = Integer.parseInt(input[1]); // 행 세로
			 for (int j = a; j < a + 10; j++) {
			 // 사각형 부분에 1을 넣어주기
				 for (int k = b; k < b + 10; k++) {
			          paper[k][j] = 1;
				 }
			 }
			
		 }
			
		// 2차원 배열 출력. 1인 숫자만 더하기.
		int res = 0;
		for (int i = 0; i < 100; i++) {
			 for (int j = 0; j < 100; j++) {
			      if (paper[i][j] == 1) {
			          res += paper[i][j];
			      }
			 }
		}
		bw.write(Integer.toString(res)); // 값 할당
		bw.flush(); //출력
		br.close(); //종료
		bw.close(); //종료
	 }
}