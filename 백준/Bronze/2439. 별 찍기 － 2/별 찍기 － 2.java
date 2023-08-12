import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		String[] b = new String[a];
		b[0] = "*";
		
		for(int i=0; i<b.length-1; i++) { 
			b[i+1] = b[i] + "*";		  	
		} // 입력
		
		for(int i=0; i<b.length; i++) {
			for(int j=b.length-1;  j>i; j--) {
				bw.write(" ");
			}	
			bw.write(b[i] + "\n");
		} // 출력
		
		bw.flush();
		bw.close();
		br.close();
	}
}