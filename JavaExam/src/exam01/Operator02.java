package exam01;

public class Operator02 {

	public static void main(String[] args) {
		
		int age = 20;
		
		// 삼항연산자
		String s = age>= 20 ? "성인" : "미성년자";
		System.out.println(s);
		
		//if문
		String n = null;
		if(age >= 20) {
			s = "성인";
		}else {
			s="미성년자";
		}
		System.out.println(s);

	}

}
