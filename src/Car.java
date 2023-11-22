import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Car implements Methods{
    private String mark;
    private int year;
    private BigDecimal price;
    private Cuzov cuzov;

    public Car(String mark, int year, BigDecimal price) {
        this.mark = mark;
        this.year = year;
        this.price = price;
    }

    public Car(String mark, int year, BigDecimal price, Cuzov cuzov) {
        this.mark = mark;
        this.year = year;
        this.price = price;
        this.cuzov = cuzov;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Cuzov getCuzov() {
        return cuzov;
    }

    public void setCuzov(Cuzov cuzov) {
        this.cuzov = cuzov;
    }

    @Override
    public void bodyTypeIdentification() {
        if(cuzov.equals(Cuzov.SEDUN) || cuzov.equals(Cuzov.HETCHBEK)){
            System.out.println("Passanger class car");
        }else if(cuzov.equals(Cuzov.KROSSOVER) || cuzov.equals(Cuzov.VNEDOROJNIK)){
            System.out.println("Off-road class car");
        }
        else if(cuzov.equals(Cuzov.UNIVERSAL)){
            System.out.println("Universal class car");
        }
    }

    @Override
    public void determinationoYearOfManufacture() {
        System.out.println("Cars age: " + (LocalDate.now().getYear()-year));
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", cuzov=" + cuzov +
                '}';
    }
}
