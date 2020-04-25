import java.util.Scanner;

class Series 
{
  public static void test(int n )
  { int c =2;
    int a =1;
    System.out.print(a+",");
     if (n>2)
    for(int i =1 ; i<=n-1 ; i++)
    { 
      a=a+c;
      System.out.print(""+a+",");
    }

  }

}

class Test
{
  public static void main(String[] args) 

  {   Scanner s = new Scanner(System.in);
      System.out.print("enter the length of series = ");
      int n = s.nextInt();
      Series s1 = new Series();
       s1.test(n);
  }
}
