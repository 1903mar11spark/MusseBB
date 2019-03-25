package weekb;

public class FizzBuzz {


	
	public void fizzBuzz1(){
		int i=0;
		while(i<=100) {
			if (i%3==0 && i%5==0) {
				System.out.println("fizzbuzz");
			} else if(i%3==0) {
				System.out.println("fizz");
			} else if (i%5 == 0) {
				System.out.println("buzz");
			} else
			System.out.println(i);
			i++;
		}
	}
	public void fizzBuzz2(int m, int n){
		
		if(m>n) {
			int temp=n;
			n=m;
			m=temp;
		}
		int i=m;
		while(i<=n) {
			if (i%3==0 && i%5==0) {
				System.out.println("fizzbuzz");
			} else if(i%3==0) {
				System.out.println("fizz");
			} else if (i%5 == 0) {
				System.out.println("buzz");
			} else
			System.out.println(i);
			i++;
		}
	}
	public void fizzBuzz3(int m, int n, int fizzNum, int buzzNum){	
		if(m>n) {
			int temp=n;
			n=m;
			m=temp;
		}
		int i=m;
		while(i<=n) {
			if (i%fizzNum==0 && i%buzzNum==0) {
				System.out.println("fizzbuzz");
			} else if(i%fizzNum==0) {
				System.out.println("fizz");
			} else if (i%buzzNum == 0) {
				System.out.println("buzz");
			} else
			System.out.println(i);
			i++;
		}
	}
	public void fizzBuzz4(int m, int n, int[] numbers, String[] terms){
		if(m>n) {
			int temp=n;
			n=m;
			m=temp;
		}
		
		
		
		
		for(int i=m; i<=n; i++) {
			for(int k=0;k<terms.length;k++) {
				if(i%numbers[k]==0) {
					System.out.print(terms[k]);
					}
			}
			
			System.out.println(i);
		
			
				
		}
	}
	//Did not complete part 4, I was trying to create a condition to fix the problem 
	//which prints I
	public boolean inArray(int i,int[]numbers)
	{
	    
	    for(int j=0;j<numbers.length;j++)
	    {
	        if(j%numbers[j]==0){return true;}
	    }
	    return false;
	}

	
}
