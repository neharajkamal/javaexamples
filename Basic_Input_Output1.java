import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the day of the week: ");
        String day = sc.nextLine();
        System.out.println();
    
        System.out.print("How many widgets did you sell?: ");
        int widgets = sc.nextInt();
        System.out.println();
    
        System.out.print("How much is each widget?: ");
        double costPer = sc.nextDouble();
        System.out.println();
        
        //Calculate the total money here
        double total = widgets*costPer;
        
        //Using printf, print the sentence in the example shell
        System.out.printf("On %s, you sold %,d widgets and made $%,.2f.", day,widgets,total); 
        
    }
}