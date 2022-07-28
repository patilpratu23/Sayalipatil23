import java.util.StringTokenizer;
class StringM
{
	void display()
	{
		StringTokenizer st1=new StringTokenizer("My name is sayali"," ");
		System.out.println("token of StringM class:");
		while(st1.hasMoreTokens())
		{
			System.out.println(st1.nextToken());
		}
	}
}
class StringN
{
	void display1()
	{
		StringTokenizer st2=new StringTokenizer("Today is Monday"," ");
		System.out.println("token of StringN class:");
		while(st2.hasMoreTokens())
		{
			System.out.println(st2.nextToken());
		}
	}
}
class MainTokenizer
{
	public static void main(String args[])
	{
		StringM s1=new StringM();
		StringN s2=new StringN();
		s1.display();
		s2.display1();
	}
}