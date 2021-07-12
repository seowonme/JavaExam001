package exam01;

public class Operator01 {
	
	public static void main(String[] args) {
		
		int a = 1;
		System.out.println("a = "+a);
		
		//a의 값 1증가
		a++;
		System.out.println("a = "+a);
		
		//b에 a의 값을 대입 후 a의 값 1증가
		int b = a++;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		//a의 값을 1증가 후 c에 대힙
		int c = ++a;
		System.out.println("a = "+a);
		System.out.println("c = "+c);
		
	}

}
