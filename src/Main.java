import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        CarrotSeller firstSeller = new CarrotSeller();
        CarrotSeller secondSeller = new CarrotSeller();

        firstSeller.setSellerName("Alfons");
        firstSeller.setSellerAddress("Navrátilova 183, Praha 3");
        firstSeller.setDateOfBirth(LocalDate.of(1995,10,11));
        firstSeller.setDealsAmount(312);
        firstSeller.setTotalSoldCarrotWeight(1955.3);
        firstSeller.setCityOfOrigin("Prague");
        firstSeller.setLicenceNumber("5AB3358");
        firstSeller.setFuelConspumtion(11);

        secondSeller.setSellerName("Pavel");
        secondSeller.setSellerAddress("Evropská 6125, Brno");
        secondSeller.setDateOfBirth(LocalDate.of(1983,4,2));
        secondSeller.setDealsAmount(227);
        secondSeller.setTotalSoldCarrotWeight(1203);
        secondSeller.setCityOfOrigin("Brno");
        secondSeller.setLicenceNumber("1BC45L6");
        secondSeller.setFuelConspumtion(10);

        System.out.println("First sellers name: " + firstSeller.getSellerName());
        System.out.println("Second sellers name: " + secondSeller.getSellerName());
    }
}