import java.util.*;
public class Main {
    public static void main(String[] args) {
        pizza_ngon_s1vn pz = new pizza_ngon_s1vn();
        Scanner sc = new Scanner(System.in);

        //add pizza to menu
        pz.accept_menu("Peppy Paneer",595, 395, 215, 15);
        pz.accept_menu("Indi Tandoori Paneer",695,400,235,14);
        pz.accept_menu("Farmhouse",700,495,315, 14);
        pz.accept_menu("Margherita",535,335,185, 10);
        pz.accept_menu("Mexican Green Wave",570,370,200, 20);
        pz.accept_menu("Veggie Paradise ",595,395,215, 13);
        pz.accept_menu("Chicken Paradise",695,400,235, 15);
        pz.accept_menu("Pasta Pizza",595,395,215,20);
        pz.accept_menu("Chicken Sausage",715,415,250, 12);
        pz.accept_menu("Chicken Barbeque",735,435,275, 20);

        //Add registered customers
        pz.accept_customer("Manh", "KTX KHU B, Thu Duc District",1, "0971456675");
        pz.accept_customer("Vinh", "401, KB Society, Baner",3, "0912301774");
        pz.accept_customer("Thinh", "22, Greenland County, Deccan Gymkhana",5, "0335032699");
    }
}
