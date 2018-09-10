import com.sun.org.apache.xpath.internal.operations.Bool;

public class City {

    String name;
    private int size;
    private boolean isCapital;
    private boolean hasMetro;


    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    public Boolean getCapital() {
        return isCapital;
    }

    private void setCapital(Boolean capital) {
        isCapital = capital;
    }

    public Boolean getHasMetro() {
        return hasMetro;
    }

    private void setHasMetro(Boolean hasMetro) {
        this.hasMetro = hasMetro;
    }


    public City(String name)
    {
        this.name = name;
    }

    public City(String name, int size)
    {
        this.name = name;
        this.size = size;
    }
    public City(String name, int size, Boolean cap)
    {
        this.name = name;
        this.size = size;
        this.isCapital = cap;
    }
    public City(String name, int size, Boolean cap, Boolean metro)
    {
        this.name = name;
        this.size = size;
        this.isCapital = cap;
        this.hasMetro = metro;
    }

    public void print()
    {
        System.out.println("Name - " + name);
        if(size != 0) {
            System.out.println("Size - " + size + " ppl");
        }
        System.out.println("Is capital - " + isCapital);
        System.out.println("Has metro - " + hasMetro);
    }
}
