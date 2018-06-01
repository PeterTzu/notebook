package practise;

public class app_GCD //2018.6.1
{

	public static void main(String[] args)
	{
		int a=42,b=147;
		//int c=GCD(a,b);
		int ans=GCD(a,b);
		int ans1=LCM(a,b);
		System.out.println("GCD="+ans+" LCM="+ans1);
	
		
	}
	public static int GCD(int n,int m)
	{	if(m==0)return n;
		else return GCD(m,n%m);
		
	}
	public static int LCM(int n,int m)
	{	int gcd=GCD(n,m);
		return n*m/gcd;
		
	}
	
}
