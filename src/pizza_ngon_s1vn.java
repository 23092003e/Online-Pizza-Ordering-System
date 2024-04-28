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
        delivery_locations = "\n\t\t\t\t1.Thu Duc city\n\t\t\t\t2. District 1\n\t\t\t\t3.District 3\n\t\t\t\t4.District 9\n\t\t\t\t5.District 12\n\t\t\t\t6.Di An City\n\t\t\t\t7.District 5\n\t\t\t\t8.Binh Thanh District\n\t\t\t\t9.Go Vap District\n\t\t\t\t10.Phu Nhuan District";
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
    
    private boolean validate_mobile(String mobile_no) {
        // check if length of input is 10 digits
        if(mobile_no.length()!=10)
            return false;
        else {
        //check whether any character other than digits 0-9 is present in input
            for(int i=0; i<mobile_no.length();i++) {
                if (mobile_no.charAt(i)<48 || mobile_no.charAt(i)>57) {
                return false;}
            }
        }
        return true;
    }

}
