import java.util.Scanner;

public class forloops {

	public static void main(String[] args){
		showGeniusOne();
		showGeniusTwo();
		
	}	
		private static void showGeniusTwo()
		{
			Scanner number = new Scanner(System.in);
	    	System.out.println("Choose a upper bound");
	    	int upper = number.nextInt();
	    	System.out.println("Choose a lower bound");
	    	int lower = number.nextInt();
	    for(int a=lower; a<upper; a+=1)
	    	{
	    		
	    	}
		}
		public static void showGeniusOne() 
		{
		
			int sum=0;
			   for (int n=5; n<=100; n+=5 ){
				sum+=n;
				
			   }
			   System.out.print(sum);
			   

		}
		
		
		
		
		

}
