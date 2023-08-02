import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		
		int MC = (M+C)/60;
		sc.close();
		
		if(H+MC<24) {
			H= H+MC;
		}else {
			H=H+MC-24;
		}
		
		if(M+C- MC*60>=0) {
			M = M+C-MC*60;
		}else {
			M = 1-(M+C-MC*60);
		}
		System.out.println(H + " " + M);
	}
}