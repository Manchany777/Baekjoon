import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result;
		sc.close();
		
		if(a == b && b == c) {
			result = 10000+a*1000;
			System.out.println(result);
		} else if (a == b || b == c || a == c){
			result = (a==b)?a:c;
            System.out.println(1000+result*100);
		} else {
            int smallest = Math.max(a, Math.max(b, c));
            System.out.println(smallest*100);
		}
	}
}