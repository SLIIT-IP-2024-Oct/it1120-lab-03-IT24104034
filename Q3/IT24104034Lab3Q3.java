import java.util.Scanner;
public class IT24104034Lab3Q3{    
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the Rupee amount: ");
   int Amount = input.nextInt();

   int N5000 = Amount/5000;
   System.out.println("5000 Notes - " + N5000);
   Amount = Amount -(N5000*5000);

   int N1000 = Amount/1000;
   System.out.println("1000 Notes - " + N1000);
   Amount = Amount -(N1000*1000);

   int N500 = Amount/500;
   System.out.println("500 Notes - " + N500);
   Amount = Amount -(N500*500);

   int N200 = Amount/200;
   System.out.println("200 Notes - " + N200);
   Amount = Amount -(N200*200);

   int N100 = Amount/100;
   System.out.println("100 Notes - " + N100);
   Amount = Amount -(N100*100);

   int N50 = Amount/50;
   System.out.println("50 Notes - " + N50);
   Amount = Amount -(N50*50);

   int N20 = Amount/20;
   System.out.println("20 Notes - " + N20);
   Amount = Amount -(N20*20);

   int N10 = Amount/10;
   System.out.println("10 Notes - " + N10);
   Amount = Amount -(N10*10);

   int N5 = Amount/5;
   System.out.println("05 Notes - " + N5);
   Amount = Amount -(N5*5);

   int N2 = Amount/2;
   System.out.println("02 Notes - " + N2);
   Amount = Amount -(N2*2);

   int N1 = Amount/1;
   System.out.println("01 Notes - " + N1);
   Amount = Amount -(N1*1);

  input.close();
 } 
}
