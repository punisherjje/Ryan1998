
package fruitbasket;
import java.util.Scanner;
import java.util.Stack;
public class FruitBasket {
    public static void main(String []args){

    Stack basket = new Stack();
    Scanner input = new Scanner (System.in);
    System.out.println("How many fruits do you like?");
    int numFruits = input.nextInt();
   System.out.println("Apple");
    System.out.println("Orange");
    System.out.println("Mango");
    System.out.println("Guava");
    System.out.println("Get and eat fruits that you like" + basket);
    
    System.out.println("Choose a fruit to get: Press A-Apple, O-Orange, M-Mango, G-Guava, ");
    for(int x = 1; x <= numFruits; x++){
        System.out.println(" fruit no " + x + " of " + numFruits);
        char fruit = input.next(). toUpperCase().charAt(0);
        
        switch (fruit) {
            case 'A':
                basket.push("Apple");
                break;
            case 'O':
                basket.push("Orange");
                break;
            case 'M':
                basket.push("Mango");
                break;
            case 'G':
                basket.push("Guava");
                System.out.println("Here are the fruit you choose");
                System.out.println(basket);
                for (int y =0; numFruits  > y; y++){
                    System.out.println("Press E to eat your Fruits");
                    char eat = input.next().toUpperCase().charAt(0);
                    basket.pop();
                   
                    System.out.println(" remaining Fruits " + basket + "\n");
                    
                }
                if(basket.isEmpty()){
                    System.out.println(" No more fruits ");
                    
        } 
                {
        }
    }
    }
}
}
    
