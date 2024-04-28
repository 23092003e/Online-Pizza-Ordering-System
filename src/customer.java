public class customer
{
    String name;             // stores name of the customer
    String address;          // stores address of the customer (house no, building name)
    String mobile_number;        // stores mobile number of the customer
    int location;            // stores an integer denoting the delivery location of the customer

    public customer(String name, String address, int location, String mn)
    {
        this.name=name;
        this.address= address;
        this.mobile_number= mn;
        this.location = location;
    }
}