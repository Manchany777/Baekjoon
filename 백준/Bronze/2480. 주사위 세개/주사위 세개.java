import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result1;
		sc.close();
		
		if(a == b && b == c) {
			result1 = 10000+a*1000;
		} else if (a == b || b == c || a == c){
			int sameNumber;
            if (a == b) {
                sameNumber = a;
            } else if (b == c) {
                sameNumber = b;
            } else {
                sameNumber = c;
            }
            result1 = 1000 + sameNumber * 100;
		} else {
			 result1 = Math.max(a, Math.max(b, c)) * 100;
		}
		System.out.println(result1);
	}
}