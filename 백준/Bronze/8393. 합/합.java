import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.close();
		int a = 0;
		
		
		for(int i=1; i <= t; i++) {
			a = a + i;
		}
		System.out.print(a);
	}
}