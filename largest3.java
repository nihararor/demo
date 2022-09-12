public class largest3
{
	public static void main(String args[])
		{
			int number1,number2,number3;
			number1=Integer.parseInt(args[0]);
			number2=Integer.parseInt(args[1]);
			number3=Integer.parseInt(args[2]);
			
        		if( number1 >= number2 && number1 >= number3){
          			System.out.println(number1+" is the largest Number");
				}

        		else if (number2 >= number1 && number2 >= number3)
          			System.out.println(number2+" is the largest Number");

       			 else
         			 System.out.println(number3+" is the largest Number");
       
    } 
} 