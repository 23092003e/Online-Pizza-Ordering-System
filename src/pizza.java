class Pizza
{
    String name;                    // stores name of the pizza
    int cost_L, cost_M, cost_S;     // variables to store the costs of large, medium and small size pizza
    int time_req;                  // stores the time required to make the pizza

    public Pizza(String n, int cl, int cm, int cs, int t)      // parameterized constructor
    {
        this.name=n; //name of pizza
        this.cost_L=cl; //costs of large
        this.cost_S= cs; //costs of small
        this.cost_M= cm; //costs of medium
        this.time_req=t; //time to make a pizza
    }
}