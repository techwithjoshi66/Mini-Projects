import java.util.Scanner;

public class RestaurantManagementSystem {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //Initialize variables for total costs
        double tamt = 0.0;//Total cost for Starters
        double tamt1 = 0.0;//Total cost for Main Course
        double tamt3 = 0.0;//Total cost for Desserts

        double tot = 0.0;//Grand total food cost(tamt + tamt1 + tamt2)
        double gst = 0.0; //Calculated GST 
        double gtotal = 0.0;//Final amount to be paid(tot + gst)

        //Variables for order logic
        String choice1 = "";
        String choice = "Y";
        String str = "";

        //Variables for order quantities and items numbers
        int vstr =0;//Veg Starter item number
        int tvstr = 0;//veg starter quantity
        int nvd = 0;//Non-veg starter item number
        int tnvstr =0;//Non-veg starter quantity 
        int vfd =0;//Main Course item quantity
        int tvfd =0;//Main Course quantity
        int d = 0;//Desert item number
        int totald = 0;//Dessert Quantity

        double amt =0.0;//Temporary variable to store cost of current item * Quantity

        //------START : Main Program Loop--------
        do {
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("Welcome to the Multi Cuisine Restaurant!!! ");
            System.out.println("--------------------------------------------------------------");
            System.out.println("1: Starter Corner");
            System.out.println("2: Main Course");
            System.out.println("3: Dessert Corner");
            System.out.println("E: Enter to print the Bill");
            System.out.println("---------------------------------------------------------------");
            System.out.println("Enter Your Choice(1, 2, 3, or E): ");
            choice1 =  input.next();

            switch(choice1.toUpperCase()){
                case "1": // Starter Corner
                    choice = "Y"; // Reset inner loop choice

                    System.out.println("\n--- Welcome to Starter Menu!!!---");
                    System.out.println("Enter 'VS' for Veg Starter or 'NVS' for Non-Veg Starter: ");
                    str = input.next();

                    if(str.equalsIgnoreCase("VS")){
                        System.out.println("\n--- Veg Starter (Price in Rs.)---");
                        System.out.println("1.Paneer Tikka\t\t\t\t110");
                        System.out.println("2.Veg Seekh Kabab\t\t\t110");
                        System.out.println("3.Hara Bhara Kabab\t\t\t110");
                        System.out.println("4.Shanghai Spring Roll\t\t150");
                        System.out.println("5.American Corn Ball\t\t150");
                        System.out.println("6.Crispy American Corn\t\t140");
                        System.out.println("7.Crispy Baby Corn\t\t\t140");
                        System.out.println("8.Crispy Mushroom\t\t\t120");
                        System.out.println("9.Crispy Chilly Potato\t\t120");
                        System.out.println("10.Crispy Chilly Chana\t\t150");

                        while (choice.equalsIgnoreCase("Y")) {
                            System.out.println("\n Choose the Veg starter by entering number: ");
                            vstr = input.nextInt();
                            System.out.println("Enter the quantity: ");
                            tvstr = input.nextInt();

                            //Calculation for Veg Starters
                            amt = 0.0;
                            if (vstr >= 1 && vstr <=3){
                                amt = tvstr * 110.0;
                            }else if(vstr == 4 || vstr == 5 || vstr == 10) {
                                amt = tvstr * 150.0;
                            }else if (vstr == 6 || vstr == 7){
                                amt = tvstr * 140.0;
                            }
                            else if (vstr == 8 || vstr == 9){\
                                amt = tvstr *120.0;
                            }
                            tamt += amt;//Add to total starter cost
                            System.out.println("Do you want to place more order? Enter Y/N: ");
                            choice = input.next();
                        }
                    }else if (str.equalsIgnoreCase("NVS")) {
                        System.out.println("\n--- Non-Veg Starters (Price in Rs.) ---");
                        System.out.println("1.Chicken Tikka\t\t\t\t170");
                        System.out.println("2. Murg Reshmi Kabab\t\t\t170");
                        System.out.println("3.Murg Chilli Kabab\t\t\t160");
                        System.out.println("4.Chicken Seekh Kabab\t\t180");
                        System.out.println("5.Tangdi Kabab\t\t\t\t190");
                        System.out.println("6.Murg Tandoori\t\t\t\t190");
                        System.out.println("7.Fish Ajwain Tikka\t\t\t190");
                        System.out.println("8.Chilli Chicken\t\t\t160");
                        System.out.println("");
                    }
            }
        }
    }
}