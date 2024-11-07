import java.util.Scanner;
public class IT24104034Lab3Q2{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the monthly salary: ");
  double Monthly_Salary = input.nextDouble();
  System.out.print("Enter the number of OT hours: ");
  double OT_hours = input.nextDouble();
  System.out.print("Enter the OT hourly rate: ");
  double OT_HourlyRate = input.nextDouble();
  double OT_Amount = OT_hours * OT_HourlyRate;
  double Total_Salary = Monthly_Salary + OT_Amount;
  System.out.print("The total salary including OT is: " + Total_Salary);
  input.close();
 }
}