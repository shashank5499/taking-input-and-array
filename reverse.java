public class reverse{

    public static void main(String[] args) {
        
        int number = 123;
        int d,r=0;
        while (number!=0)
        {
          d=number%10;
          r=r*10+d;
          number=number/10;
        }
        System.out.println("The reverse is: " + r);
    }
}