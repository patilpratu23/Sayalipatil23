interface Rose
    {
      final int b=6;
      public void display();
    }
interface Lily
    {
      final int c=9;
      public void display1();
    }


class Value implements Rose,Lily
  {
            public void display()
            {
              System.out.println("Roses values is "+b);
            }
            public void display1()
            {
                System.out.println("Lylies values is "+c);
            }
  }

class MainInterface
{
    public static void main(String arg[])
    {
        Value V1=new Value();
        V1.display();
        V1.display1();

    }
	
}