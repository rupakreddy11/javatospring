class Demo{

    int a;

    public int add(int n1, int n2)
    {
        int r = n1+n2;
        return r;
    }
}



public class Calc {

    public static void main(String a[])
    {
        int num1=4;
        int num2=6;

        Demo d = new Demo();

        int result = d.add(num1, num2);

        //int result = num1+num2;

        System.out.println(result);
    }
    
}
