package pattern;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4,m=5;
		System.out.println("1.Pattern for Rectangle");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	System.out.println("2.Pattern for hollow Rectangle");
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=n;j++)
		{
			if(i==1||j==1||j==n||i==n)
			{
				System.out.print("*"+" ");
			}
			else
			{
				System.out.print(" "+" ");
			}
		}
		System.out.println();
		}
	System.out.println("3.Pattern to print Triangle");
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	System.out.println("4.Pattern to print Reverse Triangle");
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i+1;j++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	System.out.println("5.Inverse Triangle Pattern");
	for(int i=1;i<=n;i++)
	{
		//Inner to print Spaces
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		//This Inner Loop is to print Stars 
		for(int j=1;j<=i;j++) {
		System.out.print("*");
		}
		System.out.println(" ");
	}
	System.out.println("6.Printing Number Pattern");
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("7.Printing Number Pattern in Reverse");
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m-i+1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	System.out.println("8.Printing Number pattern from 1 to 15[Floyid Triangle]");
		int number=1; 
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(number+"  ");
				number++;
			}System.out.println();
		}
	System.out.println("9.Print Triangle using  0 and 1");
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((j+i)%2==0){
				System.out.print("1"+" ");
				}
				else {
					System.out.print("0"+" ");
				}
			}
			System.out.println();
		}
		System.out.println("10.Butterfly Pattern");
		//Spaces are 2(n-i),for stars star = i
		for(int i=1;i<=n;i++)
		{//1st part
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			//2nd part
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i=n;i>=1;i--)
		{//1st part
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			//2nd part
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("10.Solid Rhombus or Parallelogram Pattern");
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=m;j++) {
			System.out.print("*");
			}
			System.out.println(" ");
		}
	System.out.println("11.Solid Hollow Rhombus or Parallelogram Pattern");
	for(int i=1;i<=m;i++)
	{
		for(int j=1;j<=m-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=m;j++) {
			if(j==1||j==m||i==1||i==m) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println(" ");
	}
	System.out.println("12.Number Pyramid Pattern");
	for(int i=1;i<=m;i++)
	{
		for(int j=1;j<=m-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
	 
	}
		
	System.out.println("13.Palindrome Pattern");
	for(int i=1;i<=m;i++)
	{
		for(int j=1;j<=m-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j>=1;j--)
		{
			System.out.print(j);
		}
		for(int j=2;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	System.out.println("14.Diamond Pattern");
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=2*i-1;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=n;i>=1;i--)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=2*i-1;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
		
	
}
}
