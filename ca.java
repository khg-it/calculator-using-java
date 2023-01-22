import java.util.*;
public class ca {
    public static void main(String args[]){
    int sum,sub,div,mul,mod;
    sum=sub=div=mul=mod=0;
 System.out.println("enter any 2 number: ");
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 System.out.println("enter the operation u want to perform...");
 char op=sc.next().charAt(0);
 switch(op)
 {
    case '+':
            sum=a+b;
            System.out.println(sum);
            break;
   case '-':
            sub=a-b;
            System.out.println(sub);
            break;
   case '*':
            mul=a*b;
            System.out.println(mul);
            break;
   case '/':
            div=a/b;
            System.out.println(div);
            break;
     case '%':
            mod=a%b;
            System.out.println(mod);
            break;
         
           
 }
}



    
}
