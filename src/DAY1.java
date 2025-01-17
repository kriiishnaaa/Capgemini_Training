import java.util.*;
public class DAY1 {
    public static void main(String [] args){
        int choice=0;
        int ans=0;
        int a, b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter the choice as 1: Addition, 2: Multiplication, 3: Subtraction, 4: Division");
        choice=sc.nextInt();
        switch(choice){
            case 1: ans=a+b;
                break;
            case 2: ans=a*b;
                break;
            case 3: ans=Math.abs(a-b);
                break;
            case 4: ans=a/b;
                break;
        }
        System.out.println(ans);
    }
}
