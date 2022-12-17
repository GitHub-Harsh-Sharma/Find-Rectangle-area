import java.io.*;
class Rectangle
{
    public static void main(String args[])throws IOException
    {
        int length,breadth,area;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the value of length");
        length=Integer.parseInt(br.readLine());
        System.out.println("Enter the value of breadth");
        breadth=Integer.parseInt(br.readLine());
        area=length*breadth;
        System.out.println("area="+area);
    }
}