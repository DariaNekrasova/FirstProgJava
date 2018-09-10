import com.sun.org.apache.xpath.internal.operations.Bool;

public class NewCat {

    String name;
    int age;
    String color;
    Boolean hasMedals;

    public NewCat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Boolean getHasMedals() {
        return hasMedals;
    }

    public void setHasMedals(Boolean hasMedals) {
        this.hasMedals = hasMedals;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    /*  public static NewCat bornCat(String nameCat, int ageCat)
    {
        NewCat Cat1 = new NewCat(nameCat, ageCat);
       // Cat1.name = "Vaska";
       // Cat1.age = 0;

        return Cat1;
    }*/

    public void scatch() {
        System.out.println(this.name + " do SCRP SCRP");
    }

    public void run() {
        System.out.println(this.name + " is running!");
    }

    public void eat(String food) {
        System.out.println(this.name +  food + "!");
    }

    public void sleep(String place) {
        System.out.println(this.name + " sleep on the " + place + "!");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {}

    }

    public void fight(String animal) {
        System.out.println(this.name + " fight with " + animal + "!") ;

    }
    public void scream() {
        System.out.println(this.name + " scream: MEOOOO!");

    }
}
