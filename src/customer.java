public class customer
{
    String name;             // stores name of the customer
    String address;          // stores address of the customer (house no, building name)
    String mobile_no;        // stores mobile number of the customer
    int location;            // stores an integer denoting the delivery location of the customer

    public customer(String n, String adr, int loc, String mn)
    {
        this.name=n;
        this.address= adr;
        this.mobile_no= mn;
        this.location = loc;
    }
}