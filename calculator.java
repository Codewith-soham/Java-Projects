import java.util.*;
public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
             
        System.out.println("Enter 1 number ");
        int a = sc.nextInt();
        System.out.println("Enter 2 number ");
        int b = sc.nextInt();
        
        System.out.println("Select operation you want to perform (ADD,SUB,MULT,DIV) \n for ADD-1,SUB-2,MULT-3,DIV-4");

        int operation = sc.nextInt();

        if (operation==1) {
            int sum =a+b;
            System.out.println(sum);

                
            } 
            else if (operation==2) {
                int sub= a-b;
                System.out.println(sub);
                
            } 
            else if(operation==3){
                int mult = a*b;
                System.out.println(mult);
            }
            else{
                int div = a/b;
                System.out.println(div);
            }
            

            
            
        }
        
        
        
        

        
        
        
    }