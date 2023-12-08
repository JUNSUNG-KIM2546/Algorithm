import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	 public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    int[][] listA;
	    int[][] listB;
	    int[][] listResult;
	    
	    String input[] = br.readLine().split(" ");
	    
	    int co1 = Integer.parseInt(input[0]);
	    int co2 = Integer.parseInt(input[1]);
	    
	    // 배열 크기 설정
	    listA = new int[co1][co2];
	    listB = new int[co1][co2];
	    listResult = new int[co1][co2];
	    
	    // A리스트에 입력 값 넣기
		for(int i=0; i<co1;i++) {
			String put[] = br.readLine().split(" ");
			for(int j=0; j<co2; j++) {
				listA[i][j] = Integer.parseInt(put[j]);
			}
		}
		// B리스트에 입력 값 넣기
		for(int i=0; i<co1;i++) {
			String put[] = br.readLine().split(" ");
			for(int j=0; j<co2; j++) {
				listB[i][j] = Integer.parseInt(put[j]);
			}
		}
		
		// Result리스트에 입력 값 더해서 넣기
		for(int i=0; i<co1;i++) {
			for(int j=0; j<co2; j++) {
				listResult[i][j] = listA[i][j] + listB[i][j];
			}
		}

		for (int i=0; i< listResult.length; i++) {
			for (int j=0; j< listResult[i].length; j++) {
				System.out.print(listResult[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}