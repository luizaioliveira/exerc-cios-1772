// Using what we learned so far, add a new value to the array built in the 
// first exercise, then, check and print the array updated in the console.

package EX_ARRAY;
import java.util.Scanner;

public class A05EX02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] fruits = {"Apple", "Banana", "Orange", "Avocado"};

        System.out.println("Hi! Your list of fruits is here: ");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
        
        System.out.print("Write a fruit: ");
        String newFruit = scan.next();

        for(String fruit : fruits) {
            if(fruit.contains(newFruit)){
                System.out.println("Great! " + newFruit + " is on position ");
            } else {
                System.out.println("Oh... " + newFruit + " isn't on list.");
            }
            // else is checking each value of Fruits and printing the message every time a ckeck ends.
            //I'm trying to fix it.
        }
        scan.close();
    }
}
