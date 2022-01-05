package Question6;

// Name: Kagisho Mogapi
// Student Number: 219001867

// Purpose :A java program that will use two classes that will work together while
//          one class holds methods and the other will demonstrate that all methods
//          work properly using the first class's object

public class Automobile
{
    // private fields
    int IDNum;
    String make;
    String model;
    String color;
    int year;
    int miles;

    // get and set methods for each field
    public int getIDNum(){
        return IDNum;
    }

    public void setIDNum(int IDNum) {

        if(IDNum >= 0 && IDNum <= 9999) {
            this.IDNum = IDNum;
        } // end if

        else {
            IDNum = 0;
        } // end else
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 2005 || year > 2019) {
            year = 0;
        } // end if

        else {
            this.year = year;
        } // end else
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        if(miles < 10 || miles > 60) {
            miles = 0;
        } // end if

        else {
            this.miles = miles;
        } // end else
    }

    // Constructor that accepts arguments for each field value and uses the set methods to assign the values
    public Automobile(int IDNum, String make, String model, String color, int year, int miles){
        setIDNum(IDNum);
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        setMiles(miles);
    }

}
