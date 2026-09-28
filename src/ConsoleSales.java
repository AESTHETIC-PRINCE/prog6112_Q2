public class ConsoleSales extends Consoles { 

  

    // Constructor passes the three values straight up to the parent Consoles class 

    public ConsoleSales(String consoleType, String store, int totalSales) { 

        super(consoleType, store, totalSales); 

    } 

  

    // Prints the sales report in the exact format shown in the sample screenshot 

    public void printReport() { 

        System.out.println(); 

        System.out.println("CONSOLE SALES REPORT"); 

        System.out.println("********************"); 

        System.out.println("CONSOLE TYPE: " + getConsoleType()); 

        System.out.println("STORE: " + getStore()); 

        System.out.println("TOTAL SALES: " + getTotalSales()); 

    } 

} 