import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2002, BigDecimal.valueOf(15000), Cuzov.valueOf("HETCHBEK"));
        System.out.println(car);
        car.determinationoYearOfManufacture();
        car.bodyTypeIdentification();
    }


}