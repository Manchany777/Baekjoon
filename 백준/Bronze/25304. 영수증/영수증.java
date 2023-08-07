import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();; // 총금액
		int N = sc.nextInt();  // 구매한 물건의 종류의 수
		int a = 0; // 긱 물건의 가격
		int b = 0; // 각 물건의 개수
		int total = 0; // 각 물건 가격 * 개수 * 종류의수
		
		int[][] arr = new int[N][2]; // 가격과 개수 입력배열
		
		for(int i=0; i < arr.length; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			arr[i][0] = a;
			arr[i][1] = b;
			total += arr[i][1] * arr[i][0];
//			System.out.println(
//					arr[i][0] + " " + arr[i][1] + " = "
//					+ total);
		}//for
		sc.close();
		
//		System.out.println(total);
		if (X == total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}//if
		
	}
}