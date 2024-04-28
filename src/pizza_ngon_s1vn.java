import java.util.*;
public class pizza_ngon_s1vn {
    ArrayList<Pizza> menu; // Array list which contains all available pizzas
    
    //hashtable of customer details, where a unique mobile number is mapped to a customer
    HashMap<String, customer> customer_data = new HashMap<>();

    //All delivery locations
    String delivery_locations;

    //message to print when order is confirmed
    String confirm_order_msg;

    public pizza_ngon_s1vn() {
        menu = new ArrayList<Pizza>();
        delivery_locations = "";
    }

    public void accept_customer(String name, String address, int location, String mobile) {
        //create new customer object
        customer new_customer= new customer(name, address,location, mobile);
        //Add customer to hashmap   
        customer_data.put(mobile,new_customer);
    }

    public void accept_menu(String name, int cl, int cm, int cs, int time) {
        //create a new pizza object
        Pizza new_pizza = new Pizza(name, cl,cm,cs,time); 
        //Add pizza to arraylist
        menu.add(new_pizza);       
    }
    public void clearScreen() {   
        //improves the appearance of output for a better user experience
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 
    }

}
