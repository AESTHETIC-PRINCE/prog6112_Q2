import java.util.Scanner; 

  

public class RunApplication { 

  

    public static void main(String[] args) { 

  

        Scanner input = new Scanner(System.in); 

  

      

        System.out.println("Select the beverage type"); 

        System.out.println(" 1) PS5"); 

        System.out.println(" 2) XBOX"); 

        System.out.println(" 3) SWITCH"); 

        System.out.println(); 

  

        int choice = Integer.parseInt(input.nextLine().trim()); 

  

        String consoleType;
switch (choice) { 

            case 1: 

                consoleType = "PS5"; 

                break; 

            case 2: 

                consoleType = "XBOX"; 

                break; 

            case 3: 

                consoleType = "SWITCH"; 

                break; 

            default: 

                System.out.println("Invalid choice."); 

                input.close(); 

                return; 

        } 

  

        System.out.print("Enter the store: "); 

        String store = input.nextLine(); 

  

        System.out.print("Enter the total sales of " + consoleType 

                + " consoles for " + store + ":"); 

        int totalSales = Integer.parseInt(input.nextLine().trim()); 

  

        // Create the ConsoleSales object with the values entered by the user 

        ConsoleSales sale = new ConsoleSales(consoleType, store, totalSales); 

  

        // Print the final report 

        sale.printReport(); 

  

        input.close(); 

    } 

}