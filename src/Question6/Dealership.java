package Question6;

// Name: Kagisho Mogapi
// Student Number: 219001867

public class Dealership
{
    public static void main(String[] args)
    {
        // Automobile objects
        Automobile audi = new Automobile(0 , "", "", "", 0, 0);
        Automobile ferrari = new Automobile(10000, "Ferrari",
                                    "360 Spider", "Red", 2000, 5);

        // Using get method
        System.out.println("Kagisho's Automoblile:" +
                            "\nID number: "+ferrari.getIDNum()+
                            "\nMake: "+ferrari.getMake()+
                            "\nModel: "+ferrari.getModel()+
                            "\nColor: "+ferrari.getColor()+
                            "\nYear: "+ferrari.getYear()+
                            "\nMiles Per Gallon: "+ferrari.getMiles());

        System.out.println();


        // Using set methods
        audi.setIDNum(10);
        audi.setMake("Audi");
        audi.setModel("A4");
        audi.setColor("Grey");
        audi.setYear(2015);
        audi.setMiles(15);

        System.out.println("Kyles's Automoblile:" +
                "\nID number: "+audi.getIDNum()+
                "\nMake: "+audi.getMake()+
                "\nModel: "+audi.getModel()+
                "\nColor: "+audi.getColor()+
                "\nYear: "+audi.getYear()+
                "\nMiles Per Gallon: "+audi.getMiles());

    }
}
