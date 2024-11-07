import java.util.Scanner;
public class IT24104034Lab3Q4{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a five-digit number: ");
  String Digit = input.next();
  if (Digit.length() == 5){
   System.out.print(Digit.charAt(0) + " " + Digit.charAt(1) + " " + Digit.charAt(2) + " " + Digit.charAt(3) + " " + Digit.charAt(4));
  }else{ System.out.print("Invalid, its not five digit number");  
  }
  
  input.close();
 }
}