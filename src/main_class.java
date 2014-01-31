import java.util.Scanner;
 
public class main_class {
    public static void main(String[] args){
       int games, matched, unmatched; 
       float percentage;
       float x;
       Scanner inputNumScanner = new Scanner(System.in);
 
       System.out.println("Enter # of games played");       
       games = inputNumScanner.nextInt();
 
       System.out.println("Enter # of matches: ");
       matched = inputNumScanner.nextInt();
       
       System.out.println("Enter # of unmatched");       
       unmatched = inputNumScanner.nextInt();
 
       x = matched + unmatched;
       percentage = (matched / x) / games *100;
       
       
 
       System.out.println("Your percentage is = " + percentage + "%");
    }
}