import java.io.*;

class Buffer
{
    public static void main(String arg[]) throws Exception
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       System.out.println("Enter First number : ");
       int no1 = Integer.parseInt(br.readLine());

       System.out.println("Enter Second number : ");
       int no2 = Integer.parseInt(br.readLine());

       int Ans = no1 + no2;
       System.out.println("Addiditon is : "+Ans);
    }

}