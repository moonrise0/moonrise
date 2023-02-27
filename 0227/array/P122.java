package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class P122 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Input Command[q,a1,a2,a3,a4]");
			String cmd = sc.next();
			if (cmd.equals("q")) { // 문자를 비교할때는 equals
				System.out.println("Quit...");
				break;
			} else if (cmd.equals("a1")) {
				System.out.println("5~9까지의 숫자를 입력해주세요");
				int ab = Integer.parseInt(sc.next());
				int arr[] = new int[ab];
				Random r = new Random();
			 for(int i=0; i< arr.length ; i++) { 
			         arr[i] = r.nextInt(9)+1;
					 }		       
					 System.out.println(Arrays.toString(arr));
						int sum = 0;
						int cnt = 0;
						for (int i = 0; i < arr.length; i++) {
							
								sum += arr[i];
								cnt++; }
					
						
								System.out.println(sum);
								System.out.println((double) sum / cnt );

			} else if (cmd.equals("a2")) {
				
				// 5~9까지의 숫자를 입력받는다.
				int input = Integer.parseInt(sc.next());

				// 입력받은 숫자만큼 배열을 생성하고
				int[] arr = new int[input];

				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				Random r = new Random();

				for (int i = 0; i < arr.length; i++) {
					arr[i] = r.nextInt(10);
				}

				// 배열 정보를 출력한다.
				System.out.println("배열 정보 출력 : " + Arrays.toString(arr));

				// 짝수번째 숫자들의 합과 평균을 출력한다.
			
				

				
			} else if (cmd.equals("a3")) {
				
			} else if (cmd.equals("a4")) {
				
			} else {
				System.out.println("Invalid Command");
				System.out.println("Try again.");
			}

		} // end while
		System.out.println("Bye...");
		sc.close();
	}
}
