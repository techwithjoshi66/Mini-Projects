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
        
    }
}