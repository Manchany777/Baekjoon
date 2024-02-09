import java.util.Scanner;

class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();                  // 첫째줄 입력
      int[] arr = new int[n];               // n 길이 만큼의 배열 arr 생성
      
      for(int i=0; i < arr.length; i++){     // 둘째줄 입력
          arr[i] = sc.nextInt();             // n-1 개수수만큼 arr배열에 차례로 값을 입력
      }
      
      int m = sc.nextInt();                  // 셋째줄 입력
      int count = 0;                        // 해당 값의 개수를 셀 변수 선언언
      
      for(int i=0; i < arr.length; i++) {    // 배열의 길이만큼 for문을 돌리면서 입력값과 같은 숫자 개수 계산
          if(m == arr[i])
          count += 1;
      }

      System.out.println(count);             // 결과값 출력
    }
}