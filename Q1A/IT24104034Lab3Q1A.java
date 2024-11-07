import java.util.Scanner;
public class IT24104034Lab3Q1A{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the price of 1kg of rice: ");
  double Price_1kgRice = input.nextDouble();
  System.out.print("Enter the number of kilograms you want to buy: ");
  double No_OfKilograms = input.nextDouble();
  double Pay = No_OfKilograms * Price_1kgRice;
  System.out.print("The total amount is: " + Pay);
  input.close();
 }
}
