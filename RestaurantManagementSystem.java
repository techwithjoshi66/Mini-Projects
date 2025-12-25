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
                            else if (vstr == 8 || vstr == 9){
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
                        System.out.println("9.Drums of Heaven\t\t\t180");
                        System.out.println("10.Shanghal Chicken\t\t\t180");

                        while (choice.equalsIgnoreCase("Y")){
                            System.out.println("\nChoose the non-veg starter by entering number");
                            nvd = input.nextInt();
                            System.out.println("Enter the quantity: ");
                            tnvstr =input.nextInt();

                            //Calculation for Non-Veg Starters
                            amt = 0.0;
                            if(nvd == 1 || nvd == 2){
                                amt = tnvstr * 170.0;
                            }else if (nvd == 3 || nvd == 8){
                                amt = tnvstr * 160.0;
                            }else if (nvd == 4 || nvd == 9 || nvd == 10){
                                amt = tnvstr * 180.0;
                            }else if(nvd >= 5 && nvd <= 7){
                                amt = tnvstr * 190.0;
                            }
                            tamt += amt;//Add to total starter cost
                            System.out.println("Do you want to place more order? Enter Y/N: ");
                            choice = input.next();
                        }
                    }
                    break;

                case "2" :
                    choice = "Y";// Reset inner loop choice

                    System.out.println("\n--- Main Course: Indian and Chinese Dishes! (Price in Rs.) ---");
                    str = input.next();

                    if(str.equalsIgnoreCase("V")){
                        System.out.println("\n--- Welcome to Indian Veg Dishes! (Price in Rs.) ---");
                        System.out.println("1.Shahi Paneer \t\t\t\t180");
                        System.out.println("2.Navratan Korma\t\t\t180");
                        System.out.println("3.Kadahi Paneer\t\t\t\t150");
                        System.out.println("4.Malai Kofta\t\t\t\t150");
                        System.out.println("5.Kadahi Vegetable\t\t\t140");
                        System.out.println("6.Vegetable Pakeeza\t\t\t140");
                        System.out.println("7.Shabnam Curry\t\t\t\t150");
                        System.out.println("8.Makai Corn Palak\t\t\t150");
                        System.out.println("9.Veg. Pulao\t\t\t\t110");
                        System.out.println("10.Kashmiri Pulao\t\t\t140");
                        System.out.println("11.Butter Naan\t\t\t\t140");
                        System.out.println("12.Stuffed Kulcha\t\t\t60");

                        while (choice.equalsIgnoreCase("Y")){
                            System.out.println("\nChoose the order by entering number: ");
                            vfd = input.nextInt();
                            System.out.println("Enter the quantity: ");
                            tvfd = input.nextInt();

                            //Calculation for Indian Non-Veg Dishes
                            amt = 0.0;
                            if (vfd == 1 || vfd == 2 || vfd == 9){
                                amt = tvfd * 180.0;
                            }else if (vfd ==4 || vfd == 6 || vfd == 12){
                                amt = tvfd * 150.0;
                            }else if (vfd == 5 || vfd == 8 || vfd == 10){
                                amt = tvfd * 190.0;
                            }else if (vfd == 7){
                                amt = tvfd * 170.0;
                            }else if (vfd == 11){
                                amt = tvfd * 140.0;
                            }
                            tamt1 += amt; //Add to total main course cost
                            System.out.println("Do you want to place more order? Enter Y/N: ");
                            choice = input.next();
                        }
                    }else if (str.equalsIgnoreCase("C")){
                        System.out.println("1.Schezwan Fried Rice\t\t");
                        System.out.println("2.Schezwan Chicken\t\t\t280");
                        System.out.println("3.Chilly Chicken\t\t\t280");
                        System.out.println("4.Chicken Noodle\t\t\t210");
                        System.out.println("5.Veg. Hakka Noodle\t\t\t210");
                        System.out.println("6.Chicken Manchurian\t\t190");
                        System.out.println("7.Panner Manchurian\t\t190");
                        System.out.println("8.Chilly Panner\t\t\t\t190");
                        System.out.println("9.Sanghai Fried Rice\t\t240");
                        System.out.println("10.Veg. Fried Rice\t\t\t170");
                        System.out.println("11.Chicken Fried Rice\t\t210");
                        System.out.println("12.Kimchi Rice Veg.\t\t\t210");

                        while (choice.equalsIgnoreCase("Y")){
                            System.out.println("\nChoose the order by entering number: ");
                            vfd = input.nextInt();
                            System.out.println("Enter the quantity: ");
                            tvfd = input.nextInt();

                            //Calculation for chinese Dishes
                            amt = 0.0;
                            if(vfd == 1 || vfd == 9){
                                amt = tvfd * 240.0;
                            }else if (vfd == 2 || vfd == 3){
                                amt = tvfd * 280.0;
                            }else if (vfd == 4 || vfd == 5 || vfd == 11 || vfd == 12){
                                amt = tvfd * 210.0;
                            }else if (vfd == 6 || vfd == 7 || vfd == 8){
                                amt = tvfd * 190.0;
                            }else if (vfd == 10){
                                amt = tvfd * 170.0;
                            }
                            tamt1 += amt; //Add to total main course cost
                            System.out.println("Do you want to place more order? Enter Y/N: ");
                            choice = input.next();
                        }

                    }
                    break;
            }
        }
        while (!choice1.equalsIgnoreCase("E"));
    }
}