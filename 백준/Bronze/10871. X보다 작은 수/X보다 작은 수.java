import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
      int N = Integer.parseInt(st.nextToken());  // N개의 수
      int X = Integer.parseInt(st.nextToken());  // X보다 작은 수
      int[] A = new int[N]; // 출력을 위한 배열
      
      st = new StringTokenizer(br.readLine(), " ");
      
      for(int i = 0; i < A.length; i++) {
          A[i] = Integer.parseInt(st.nextToken()); // 배열에 N개의 수 삽입입
      }
      for(int i = 0; i < A.length; i++) {
        if (A[i] < X) { // 배열을 순회하며 X보다 작은 값을 산출출
            bw.write(A[i] + " ");
        }
      }
      br.close();
      
      bw.flush(); // 남아있는 데이터 모두 출력
      bw.close();

      
    }
}