import java.util.Scanner;
/**
 * This program will ask the user for a starting counting value and the value you want to stop at and then it will print out every number starting from the starting number all the way to the second number, going up by 2
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user to input a number to start counting from
    System.out.println("What number do you want to begin counting from?");
    int startNumber = input.nextInt();

    // ask the user what number to end the counting at
    System.out.println("What number do you want to end counting at?");
    int endNumber = input.nextInt();  

    // create an if statement to determine if startnumber is even or odd
    if(startNumber % 2 == 0){
    } else{
      startNumber++;
    }

    // create for loop to start counting
    for(int count = startNumber; count <= endNumber; count = count + 2){
      System.out.println(count);
    }
    
  }
}
