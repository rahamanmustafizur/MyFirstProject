import java.util.*;
public class greeting {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n==1){
            System.out.println("hello");
        }
    else if(n==2){
        System.out.print("namaste");
    }
    else if(n==3){
        System.out.println("bonji");
    }
    else{
        System.out.println("invalid value of n");
    }
}
}
