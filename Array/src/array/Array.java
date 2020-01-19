package Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

public class Array {
    public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
        
        int []number;
        int index =0;
        int size=0;
        int stopper =1;
        
      try{ 
        while(true){
        try{  
              System.out.println("Please enter array lenght: ");
              size = num.nextInt();
              System.out.println("Your array lenght is: "+size);
              number = new int[size];
              break;
         
        }catch (InputMismatchException e){
            System.out.println("Invalid input ");
            num.nextLine();
            
        }
        }
        while(size>=stopper){
            try{
                System.out.println(stopper+" of "+size);  
            System.out.println("What index do you want to modify: ");
            index = num.nextInt();
            number[index]=0;
            System.out.println("Please enter a number to put in array["+index+"]");
            number[index] = num.nextInt();
            System.out.println(Arrays.toString(number));
            stopper++;
            
            
            
            }catch(Exception e){
                System.out.println("Invalid because" +e);
                num.nextLine();
            }
        }
     
    }catch(InputMismatchException e){
    
    }catch(ArrayIndexOutOfBoundsException e){
        
    }
}

}

