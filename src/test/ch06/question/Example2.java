package test.ch06.question;

public class Example2 {
	
	public static int max(int[] arr) {
		//만일 주어진 배열이 null이거나 크기가 0인경우, -999999를 반환한다.
		
		if (arr == null || arr.length == 0) {
			return -9999999;
		}
		
		//최대값: 하나씩 비교
		int x = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(x<arr[i]) {
				x=arr[i];
			}
		}
		return x;
			
	}

	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값: " + max(data));
		System.out.println("최대값: " + max(null));
		System.out.println("최대값: " + max(new int[] {}));
	}

}
