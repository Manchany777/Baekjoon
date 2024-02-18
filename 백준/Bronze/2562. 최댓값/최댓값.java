import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[9];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int maxNumber = Arrays.stream(arr).max().getAsInt();
        
        // int 배열을 Integer 배열로 변환
        Integer[] boxedArray = IntStream.of(arr).boxed().toArray(Integer[]::new);
        
        // Integer 배열을 List로 변환하여 indexOf 메서드를 사용
        int index = Arrays.asList(boxedArray).indexOf(maxNumber) + 1; // 인덱스는 0부터 시작하므로 +1
        
        System.out.println(maxNumber);
        System.out.println(index);
        
        br.close();
      
    }//main
}