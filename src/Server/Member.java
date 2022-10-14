package Server;

public class Member {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0] = 0;
		
		for(int i=0;i<5;i++) {
			try {
				intArray[i+1] = i+1+intArray[i];
				System.out.println("intArray["+i+"]"+"="+intArray[i]);
			}catch(Exception e) { 
			System.out.println("모든 예외 처리");
			}
		}
			
		
		
		
	}
}
