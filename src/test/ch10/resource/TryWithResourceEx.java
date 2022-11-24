package test.ch10.resource;

public class TryWithResourceEx {

	public static void main(String[] args) {
		try(MyResource res = new MyResource("A")) {
			//read2로 바꾸면 NumberFormatException 에러 발생
			String data = res.read2(); 
			int value = Integer.parseInt(data); // int형 변환
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
