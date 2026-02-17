class Customer {

    protected int custId;
    protected String custName;

    public Customer() {
        System.out.println("Customer");
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int cid) {
        custId = cid;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String cname) {
        custName = cname;
    }
}

class Guest extends Customer {

    private int delCharges;
    public Guest(){
        System.out.println("Guest Customer");
    }
}

class Regular extends Customer {

    protected int disc;
    public Regular(){
        System.out.println("Regular Customer");
    }
    public Regular(int disc){
        this.disc = disc;
    }
}

class Premium extends Regular {

    private int points;
    public Premium(){
        System.out.println("Premium Customer");
    }
    public Premium(int cid, int cname, int disc, int points){
        setCustId(cid);
        setCustName(String.valueOf(cname));

        super(disc);
        this.points = points;
    }
    public int getPoints
    () {
        return points;
    }
}

public class Tester {

    public static void main(String[] args) {
        Customer cobj = new Customer();
        Guest oGuest =new Guest();
        Regular oRegular = new Regular();
        Premium oPremium = new Premium();
    }
}