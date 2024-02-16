import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
      int N = Integer.parseInt(st.nextToken());
      int[] arr = new int[N];
      
      //System.out.println(N);
      
      st = new StringTokenizer(br.readLine(), " ");
      
      for(int i = 0; i < arr.length; i++) {
          arr[i] = Integer.parseInt(st.nextToken());
          //System.out.print(arr[i] + " ");
      }//for
      
      int maxNumber = arr[0];
      int minNumber = arr[0];
      
      for(int i = 1; i < arr.length; i++) {
        if(arr[i] < minNumber) minNumber = arr[i];
        if(arr[i] > maxNumber) maxNumber = arr[i];
      }//for
      
      System.out.print(minNumber + " ");
      System.out.print(maxNumber);
      
      br.close();
        
      bw.flush();
      bw.close();
      
    }//main
}