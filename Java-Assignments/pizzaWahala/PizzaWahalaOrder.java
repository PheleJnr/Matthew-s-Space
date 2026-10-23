import java.util.Scanner;

public class PizzaWahalaOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Pizza Types:");
        System.out.println("1. Sapa size - 4 slices, 2500 per box");
        System.out.println("2. Small Money - 6 slices, 2900 per box");
        System.out.println("3. Big boys - 8 slices, 4000 per box");
        System.out.println("4. Odogwu - 12 slices, 5200 per box");
        
        System.out.print("Enter number of guests: ");
        int guests = input.nextInt();

        input.nextLine();
        
        System.out.print("Enter pizza type (exactly as shown in Menu: Odogwu): ");
        String pizzaType = input.nextLine();
        
        
        int slicesPerBox = getNumberOfSlicesPerBox(pizzaType);
        int pricePerBox = getPriceOfBox(pizzaType);

        if (slicesPerBox == 0 || pricePerBox == 0) {
            System.out.println("Invalid pizza type entered. Please try again.");
            return;
        }     
        
                
        int boxes = calculateBoxes(guests, slicesPerBox);
        int leftover = calculateLeftover(guests, slicesPerBox);
        int totalPrice = calculateTotalPrice(boxes, pricePerBox);
        
        
        System.out.println("Number of boxes of pizza to buy: " + boxes);
        System.out.println("Number left over slices after serving: " + leftover);
        System.out.println("Price: " + totalPrice);
    }
    

     public static int getNumberOfSlicesPerBox(String pizzaType) {

        if (pizzaType.equals("Sapa size")) {
            return 4;
        } else if (pizzaType.equals("Small Money")) {
            return 6;
        } else if (pizzaType.equals("Big boys")) {
            return 8;
        } else if (pizzaType.equals("Odogwu")) {
            return 12;
        } else {
            return 0; 
        }
    }


    public static int getPriceOfBox(String pizzaType) {
        if (pizzaType.equals("Sapa size")) {
            return 2500;
        } else if (pizzaType.equals("Small Money")) {
            return 2900;
        } else if (pizzaType.equals("Big boys")) {
            return 4000;
        } else if (pizzaType.equals("Odogwu")) {
            return 5200;
        } else {
            return 0; 
        }
    }

    public static int calculateBoxes(int guests, int slicesPerBox) {
        int boxes = guests / slicesPerBox;
        if (guests % slicesPerBox != 0) {
            boxes++;
        }
        return boxes;
    }
    
    public static int calculateLeftover(int guests, int slicesPerBox) {
        int boxes = calculateBoxes(guests, slicesPerBox);
        return (boxes * slicesPerBox) - guests;
    }
    
    public static int calculateTotalPrice(int boxes, int pricePerBox) {
        return boxes * pricePerBox;
    }
}
