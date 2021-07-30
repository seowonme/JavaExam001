package algorithm01;

import java.util.Scanner;

/*
 * 까치와 강아지가 총 4마리 있는데 다리수는 12개입니다. 
 * 그런데 까치와 강아지는 각각 몇 마리 일까요?
 * */
public class MagpieDog {
	/*
	 * 탐욕알고리즘을 통해 동물 다리 수를 구하는 메소드
	 * @param n
	 * @param m
	 * @return
	 * */
	static int Leg1(int n, int m) {
		for (int i=0; i<=n; i++) {
			int f = 2*i+4*(n-i); //동물 다리 수
			if(f == m)
				return i;
		}
		return -1;
	}
	
	/**
     * 방정식에 의해 동물 다리 수 구하는 메소드
     * @param n
	 * @param m
	 * @return
     */
	static int Leg2(int n, int m) {
		return (4*n-m)/2;
	}

	public static void main(String[] args) {
		Scanner sInput = new Scanner(System.in);
		System.out.println("까치, 강아지 마리 수 : ");
		int n = sInput.nextInt();
		System.out.print("까치, 강아지 다리 갯수："); 
		int m = sInput.nextInt();
        System.out.println("까치 수는 "+Leg1(n,m)+"입니다.");
        System.out.println("까치 수는 "+Leg2(n,m)+"입니다.");

	}

}
