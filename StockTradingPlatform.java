import java.util.ArrayList;
import java.util.Scanner;

/**
 * Stock Trading Platform
 * This program simulates a basic stock trading environment.
 * Users can view stocks, buy/sell stocks, and track portfolio performance.
 * Author: Shaik Faheemunnisa
 * Internship: CodeAlpha - Task 2
 */

public class StockTradingPlatform {

    // Stock class to store stock details
    static class Stock {
        String symbol;       // Stock symbol like APPLE, GOOGLE
        String companyName;  // Full company name
        double price;        // Current price per share

        // Constructor
        Stock(String symbol, String companyName, double price) {
            this.symbol = symbol;
            this.companyName = companyName;
            this.price = price;
        }
    }

    // Portfolio class to store user's bought stocks
    static class Portfolio {
        String symbol;
        int quantity;
        double buyPrice;

        // Constructor
        Portfolio(String symbol, int quantity, double buyPrice) {
            this.symbol = symbol;
            this.quantity = quantity;
            this.buyPrice = buyPrice;
        }
    }

    // List of available stocks in market
    static ArrayList<Stock> market = new ArrayList<>();

    // User's Portfolio
    static ArrayList<Portfolio> portfolio = new ArrayList<>();

    // User's available balance
    static double balance = 50000.00; // Starting balance Rs. 50,000

    public static void main(String[] args) {

        // Initialize market stocks
        setupMarket();

        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("============================================");
        System.out.println("      WELCOME TO STOCK TRADING PLATFORM     ");
        System.out.println("============================================");
        System.out.printf("Your Starting Balance: Rs. %.2f%n", balance);

        // Keep showing menu until user exits
        do {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. View Market Stocks");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View My Portfolio");
            System.out.println("5. View Portfolio Performance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewMarket();
                    break;
                case 2:
                    buyStock(scanner);
                    break;
                case 3:
                    sellStock(scanner);
                    break;
                case 4:
                    viewPortfolio();
                    break;
                case 5:
                    viewPerformance();
                    break;
                case 6:
                    System.out.println("\nThank you for using Stock Trading Platform. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        scanner.close();
    }

    // Method to set up market stocks
    static void setupMarket() {
        market.add(new Stock("APPLE", "Apple Inc.", 15000.00));
        market.add(new Stock("GOOGLE", "Google LLC", 12000.00));
        market.add(new Stock("AMAZON", "Amazon Inc.", 18000.00));
        market.add(new Stock("TESLA", "Tesla Inc.", 8000.00));
        market.add(new Stock("MICROSOFT", "Microsoft Corp.", 11000.00));
        market.add(new Stock("INFOSYS", "Infosys Ltd.", 1500.00));
        market.add(new Stock("TCS", "Tata Consultancy Services", 3500.00));
        market.add(new Stock("RELIANCE", "Reliance Industries", 2500.00));
    }

    // Method to display all market stocks
    static void viewMarket() {
        System.out.println("\n--- MARKET STOCKS ---");
        System.out.println("Symbol     | Company Name                | Price/Share");
        System.out.println("-----------+-----------------------------+------------");

        for (Stock stock : market) {
            System.out.printf("%-11s| %-28s| Rs. %.2f%n",
                    stock.symbol, stock.companyName, stock.price);
        }
    }

    // Method to buy a stock
    static void buyStock(Scanner scanner) {
        System.out.println("\n--- BUY STOCK ---");
        System.out.printf("Available Balance: Rs. %.2f%n", balance);

        System.out.print("Enter stock symbol to buy: ");
        String symbol = scanner.next().toUpperCase();

        // Find stock in market
        Stock selectedStock = null;
        for (Stock stock : market) {
            if (stock.symbol.equals(symbol)) {
                selectedStock = stock;
                break;
            }
        }

        // Check if stock exists
        if (selectedStock == null) {
            System.out.println("Stock not found! Please enter a valid symbol.");
            return;
        }

        System.out.println("Stock: " + selectedStock.companyName);
        System.out.println("Price: Rs. " + selectedStock.price + " per share");

        System.out.print("Enter quantity to buy: ");
        int quantity = scanner.nextInt();

        // Calculate total cost
        double totalCost = selectedStock.price * quantity;

        // Check if user has enough balance
        if (totalCost > balance) {
            System.out.println("Insufficient balance! You need Rs. " + totalCost + " but have Rs. " + balance);
            return;
        }

        // Deduct Balance
        balance -= totalCost;

        // Check if stock already in portfolio
        boolean found = false;
        for (Portfolio p : portfolio) {
            if (p.symbol.equals(symbol)) {
                p.quantity += quantity;
                found = true;
                break;
            }
        }

        // Add new stock to portfolio
        if (!found) {
            portfolio.add(new Portfolio(symbol, quantity, selectedStock.price));
        }

        System.out.println("\n========================================");
        System.out.println("      STOCK PURCHASED SUCCESSFULLY!     ");
        System.out.println("========================================");
        System.out.println("Stock    : " + selectedStock.companyName);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price    : Rs. " + selectedStock.price);
        System.out.println("Total    : Rs. " + totalCost);
        System.out.printf("Remaining Balance: Rs. %.2f%n", balance);
        System.out.println("========================================");
    }

    // Method to sell a stock
    static void sellStock(Scanner scanner) {
        System.out.println("\n--- SELL STOCK ---");

        if (portfolio.isEmpty()) {
            System.out.println("Your portfolio is empty! Buy stocks first.");
            return;
        }

        System.out.print("Enter stock symbol to sell: ");
        String symbol = scanner.next().toUpperCase();

        // Find stock in portfolio
        Portfolio selectedPortfolio = null;
        for (Portfolio p : portfolio) {
            if (p.symbol.equals(symbol)) {
                selectedPortfolio = p;
                break;
            }
        }

        if (selectedPortfolio == null) {
            System.out.println("You don't own this stock!");
            return;
        }

        System.out.println("You own " + selectedPortfolio.quantity + " shares of " + symbol);
        System.out.print("Enter quantity to sell: ");
        int quantity = scanner.nextInt();

        // Check if user has enough shares
        if (quantity > selectedPortfolio.quantity) {
            System.out.println("You only have " + selectedPortfolio.quantity + " shares!");
            return;
        }

        // Get current market price
        double currentPrice = 0;
        for (Stock stock : market) {
            if (stock.symbol.equals(symbol)) {
                currentPrice = stock.price;
                break;
            }
        }

        // Calculate profit or loss
        double sellAmount = currentPrice * quantity;
        double buyAmount = selectedPortfolio.buyPrice * quantity;
        double profitLoss = sellAmount - buyAmount;

        // Update Balance
        balance += sellAmount;

        // Update Portfolio
        selectedPortfolio.quantity -= quantity;
        if (selectedPortfolio.quantity == 0) {
            portfolio.remove(selectedPortfolio);
        }

        System.out.println("\n========================================");
        System.out.println("       STOCK SOLD SUCCESSFULLY!         ");
        System.out.println("========================================");
        System.out.println("Stock      : " + symbol);
        System.out.println("Quantity   : " + quantity);
        System.out.printf("Sell Price : Rs. %.2f%n", currentPrice);
        System.out.printf("Amount     : Rs. %.2f%n", sellAmount);

        if (profitLoss >= 0) {
            System.out.printf("Profit     : Rs. %.2f%n", profitLoss);
        } else {
            System.out.printf("Loss       : Rs. %.2f%n", Math.abs(profitLoss));
        }

        System.out.printf("New Balance: Rs. %.2f%n", balance);
        System.out.println("========================================");
    }

    // Method to view portfolio
    static void viewPortfolio() {
        if (portfolio.isEmpty()) {
            System.out.println("\nYour portfolio is empty!");
            return;
        }

        System.out.println("\n--- MY PORTFOLIO ---");
        System.out.printf("Available Balance: Rs. %.2f%n", balance);
        System.out.println("Symbol     | Quantity | Buy Price   | Current Value");
        System.out.println("-----------+----------+-------------+--------------");

        for (Portfolio p : portfolio) {
            double currentPrice = 0;
            for (Stock stock : market) {
                if (stock.symbol.equals(p.symbol)) {
                    currentPrice = stock.price;
                    break;
                }
            }
            double currentValue = currentPrice * p.quantity;
            System.out.printf("%-11s| %-9d| Rs. %-8.2f| Rs. %.2f%n",
                    p.symbol, p.quantity, p.buyPrice, currentValue);
        }
    }

    // Method to view portfolio performance
    static void viewPerformance() {
        if (portfolio.isEmpty()) {
            System.out.println("\nYour portfolio is empty!");
            return;
        }

        System.out.println("\n--- PORTFOLIO PERFORMANCE ---");

        double totalInvested = 0;
        double totalCurrentValue = 0;

        for (Portfolio p : portfolio) {
            double currentPrice = 0;
            for (Stock stock : market) {
                if (stock.symbol.equals(p.symbol)) {
                    currentPrice = stock.price;
                    break;
                }
            }
            totalInvested += p.buyPrice * p.quantity;
            totalCurrentValue += currentPrice * p.quantity;
        }

        double totalProfitLoss = totalCurrentValue - totalInvested;

        System.out.printf("Total Invested    : Rs. %.2f%n", totalInvested);
        System.out.printf("Current Value     : Rs. %.2f%n", totalCurrentValue);

        if (totalProfitLoss >= 0) {
            System.out.printf("Total Profit      : Rs. %.2f%n", totalProfitLoss);
        } else {
            System.out.printf("Total Loss        : Rs. %.2f%n", Math.abs(totalProfitLoss));
        }

        System.out.printf("Available Balance : Rs. %.2f%n", balance);
    }
}