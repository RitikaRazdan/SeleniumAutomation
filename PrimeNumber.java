package w1.d1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 79,flag=0;
for (int i = 2; i < (n-1); i++) {
	if(n%i==0)
	{
	     flag=1;      
	     break;      
	}
	}
if(flag==1)
{
	System.out.println(n+" is not prime number");
}
if(flag==0) 
	System.out.println(n+" is prime number"); 
}  
}

