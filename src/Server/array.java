package Server;

public class array {

	public static void main(String[] args) {
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			int ran = (int) (Math.random() * 50); // +1은 1부터 시작 하게끔 초기화 하는 것.
			arr[i] = ran;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=========="); // <---위 배열안에 가장 큰 숫자를 찾는 예제
		int max = arr[0]; // 임의로 현재 최대값을 인덱스0번째 설정

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max = " + max);
		/**
		 * int[]arr = new int[10]; for(int i=0;i<arr.length;i++) { int ran =
		 * (int)(Math.random()*100)+1; arr[i] = ran; } for(int i=0;i<arr.length;i++) {
		 * System.out.println(arr[i]); } System.out.println("========="); int max =
		 * arr[0]; int min = arr[0];
		 * 
		 * for(int i=0;i<arr.length;i++) { if(max<arr[i]) { max = arr[i];
		 * 
		 * } }
		 */
	}

}
