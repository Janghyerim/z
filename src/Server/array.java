package Server;

public class array {

	public static void main(String[] args) {
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			int ran = (int) (Math.random() * 50); // +1�� 1���� ���� �ϰԲ� �ʱ�ȭ �ϴ� ��.
			arr[i] = ran;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=========="); // <---�� �迭�ȿ� ���� ū ���ڸ� ã�� ����
		int max = arr[0]; // ���Ƿ� ���� �ִ밪�� �ε���0��° ����

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
