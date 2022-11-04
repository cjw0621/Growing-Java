public class VipCustomer {

    private final String name;
    private final int creditLimit;
    private final String email;



    public VipCustomer(){
        this("Unknown", "XXX@XXXXX.com", 0);
    }

    public VipCustomer(String name, String email){
        this(name, email,1000);

    }

    public VipCustomer(String name, String email, int creditLimit){
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return this.name;
    }

    public int getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }



    public static void main(String[] args) {
        VipCustomer chaseWhitneyACC = new VipCustomer("Chase whitney", "cjwhtiney2892@gmail.com", 25000);

        System.out.println("Name: " + chaseWhitneyACC.getName());
        System.out.println("Email: " + chaseWhitneyACC.getEmail());
        System.out.println("Credit Limit: $" + chaseWhitneyACC.getCreditLimit());
        System.out.println("_________________________________");

        VipCustomer newCust1 = new VipCustomer();

        System.out.println("Name: " + newCust1.getName());
        System.out.println("Email: " + newCust1.getEmail());
        System.out.println("Credit Limit: $" + newCust1.getCreditLimit());
        System.out.println("_________________________________");

        VipCustomer newCust2 = new VipCustomer("Tim Burchka", "Tim@Gmail.com");

        System.out.println("Name: " + newCust2.getName());
        System.out.println("Email: " + newCust2.getEmail());
        System.out.println("Credit Limit: $" + newCust2.getCreditLimit());
        System.out.println("_________________________________");
    }
}
