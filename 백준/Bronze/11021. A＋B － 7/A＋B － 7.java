import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bf.readLine());
		String s;
		
		StringTokenizer st;
		
		for(int i=0; i<T; i++) {
			s = bf.readLine();
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			
			int[] arr = new int[T];
			arr[i] = i;
			bw.write("Case #" + (i+1) + ": " + (a+b) + "\n");
			//System.out.println("Case #" + (i+1) + ": " + (a+b));
		} // for
		bw.flush();
		bw.close();
		bf.close();
	}
}