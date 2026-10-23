package checkout;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the customer's Name: ");
        String customerName = scanner.nextLine();

        List<Product> productList = new ArrayList<>();

        while (true) {
            System.out.println("What did the user buy?");
            String productName = scanner.nextLine();

            System.out.println("How many pieces?");
            int quantity = Integer.parseInt(scanner.nextLine().trim());

            System.out.println("How much per unit?");
            double unitPrice = Double.parseDouble(scanner.nextLine().trim());

            productList.add(new Product(productName, quantity, unitPrice));

            System.out.println("Add more Items?");
            String addMore = scanner.nextLine().trim();
            if (!addMore.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("What is your name?");
        String cashierName = scanner.nextLine();

        System.out.println("How much discount will he get");
        double discountPercent = Double.parseDouble(scanner.nextLine().trim());

        Product[] cart = productList.toArray(new Product[0]);
        Receipt receipt = new Receipt(cart, cart.length, discountPercent);

        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MMM-yy h:mm:ss a", Locale.ENGLISH))
                .replace("AM", "am")
                .replace("PM", "pm");


        printHeader(customerName, cashierName, timestamp);
        printItems(cart);
        printTotals(receipt);
        System.out.println();
        System.out.printf(" THIS IS NOT A RECEIPT KINDLY PAY %.2f%n", receipt.getBillTotal());
        System.out.println("============================================================");
        System.out.println();

        System.out.println("How much did the customer give to you?");
        double amountPaid = Double.parseDouble(scanner.nextLine().trim());

        System.out.println();


        printHeader(customerName, cashierName, timestamp);
        printItems(cart);
        printTotals(receipt);
        System.out.printf("%-20s%15.2f%n", "Amount Paid:", amountPaid);
        System.out.printf("%-20s%15.2f%n", "Balance:", receipt.getBalance(amountPaid));
        System.out.println("============================================================");
        System.out.println("              THANK YOU FOR YOUR PATRONAGE");
        System.out.println("============================================================");


    }

    private static void printHeader(String customerName, String cashierName, String timestamp) {
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("Date : " + timestamp);
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("============================================================");
        System.out.printf("%20s%8s%10s%15s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("=============================================================");
    }

    private static void printItems(Product[] cart) {
        for (Product product : cart) {
            System.out.printf("%20s%8d%10.2f%15.2f%n",
                    product.getName(),
                    product.getQuantity(),
                    product.getUnitPrice(),
                    product.newlineTotal());
        }
        System.out.println("------------------------------------------------------------");
    }

    private static void printTotals(Receipt receipt) {
        System.out.printf("%-20s%15.2f%n", "Sub Total:", receipt.getSubTotal());
        System.out.printf("%-20s%15.2f%n", "Discount:", receipt.getDiscountAmount());
        System.out.printf("%-20s%15.2f%n", "VAT @ " + (Receipt.VAT * 100) + "%:", receipt.getVatAmount());
        System.out.println("============================================================");
        System.out.printf("%-20s%15.2f%n", "Bill Total:", receipt.getBillTotal());
    }
}