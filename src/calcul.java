import java.util.Scanner;

class calcul {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int mul = a*b;
        int div = a%b;
        int rem = a/b;
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
    }
    
}
