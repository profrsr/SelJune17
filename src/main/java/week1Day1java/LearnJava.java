package week1Day1java;

public class LearnJava {

	public static void main(String[] args) {
		for (int i = 1; i <101; i++) {
			System.out.println(i+" ---> "+isOdd(i));			
		}
		/*
		System.out.println(isOdd(2));
		System.out.println(isOdd(3));
		System.out.println(isOdd(4));
		System.out.println(isOdd(5));
		System.out.println(isOdd(6));*/

	}

	public static boolean isOdd(int num){
		if(num%2==1){
			return true;
		}else{
			return false;
		}
	}

}
