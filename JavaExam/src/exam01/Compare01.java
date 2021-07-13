package exam01;

public class Compare01 {

	public static void main(String[] args) {
		
		
		String s1 = "123";
		String s2 = new String ("123");
		
		//참조가 같은지 비교
		if (s1 == s2) {
			System.out.println("s1과 s2의 참조가 같다");
		}else {
			System.out.println("s1과 s2의 참조가 같지 않다");
		}
		
		//값이 같은지 비교
		if(s1.equals(s2)) {
			System.out.println("s1과 s2의 값이 같다");
		}else {
			System.out.println("s1과 s2의 값이 같지 않다");
		}
		
		//값의 대소 비교
		int result = s1.compareTo(s2);
		if (result == 0) {
			System.out.println("값이 같다");
		}else if (result < 0) {
			System.out.println("s1은 s2보다 작다");
		}else if (result > 0) {
			System.out.println("s1은 s2보다 크다");
		}

	}

}
