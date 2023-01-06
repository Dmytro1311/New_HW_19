public class Burger {
    String roll;
    String meat;
    String meatBeef;
    String cheese;
    String green;
    String mayonnaise;

    public Burger (String roll, String meat, String cheese, String green, String mayonnaise){
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.green= green;
        this.mayonnaise = mayonnaise;
        System.out.println( "Склад бургеру " + roll + " " + meat + " " + cheese + " " + green + " " + mayonnaise);
    }
    public Burger(String roll, String meat, String cheese, String green){
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.green= green;
        System.out.println("Склад бургеру " + roll + " " + meat + " " + cheese + " " + green);

    }
    public Burger (String roll, String meatBeef,String meat, String cheese, String green, String mayonnaise){
        this.roll = roll;
        this.meat = meatBeef;
        this.meat = meat;
        this.cheese = cheese;
        this.green= green;
        this.mayonnaise = mayonnaise;
        System.out.println("Склад бургеру " + roll + " " + meatBeef + " " + meat +  " " + cheese + " " + green + " " + mayonnaise);
    }
}
