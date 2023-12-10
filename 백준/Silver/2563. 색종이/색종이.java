import java.util.Scanner;

public class Main {
	 public static void main(String[] args) throws Exception {
		 Scanner scanner = new Scanner(System.in);

		 int[][] paper = new int[100][100];
		 int count = scanner.nextInt();
			
		 // count 수 만큼 입력받기
		 for (int i = 0; i < count; i++) {
			  int a = scanner.nextInt(); // 열 가로
			  int b = scanner.nextInt(); // 행 세로
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
		System.out.println(res);
	 }
}