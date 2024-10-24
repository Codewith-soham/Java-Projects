import java.util.Scanner;

public class dlapplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         String name = sc.nextLine();
         int age = sc.nextInt();

         if (age>=18) {
            System.out.println(name+"You are eligible for driving lisence");
            
         }
         else{
            System.out.println(name+"You are not eligible for driving lisence");
         }

         sc.close();
    } 
    
    
    
}
