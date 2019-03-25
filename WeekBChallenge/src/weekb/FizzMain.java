package weekb;

public class FizzMain {
public static void main(String[] args) {
	FizzBuzz b= new FizzBuzz();
	System.out.println("The Results for fizzbuzz1 are below");
	b.fizzBuzz1();
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("The Results for fizzbuzz2 are below");
	b.fizzBuzz2(18, 12);
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("The Results for fizzbuzz3 are below");
	b.fizzBuzz3(134, 12, 3, 10);
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("The Results for fizzbuzz4 are below");
	int[] num = {3,5,9,11,4};
	String[] myterms = {"fish", "sticks", "cat", "dog","turtle"};
	b.fizzBuzz4(100, 1, num, myterms);
}
}
