public abstract class Consoles implements IConsoles { 

  

    // Fields shared by every type of console sale 

    private String consoleType; 

    private String store; 

    private int totalSales; 

  

    // Constructor accepts console type, store name and total sales 

    public Consoles(String consoleType, String store, int totalSales) { 

        this.consoleType = consoleType; 

        this.store = store; 

        this.totalSales = totalSales; 

    } 

  

    @Override
     public String getConsoleType() { 

        return consoleType; 

    } 

  

    @Override 

    public String getStore() { 

        return store; 

    } 

  

    @Override 

    public int getTotalSales() { 

        return totalSales; 

    } 

}