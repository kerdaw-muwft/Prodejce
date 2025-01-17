import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        CarrotSeller firstSeller = new CarrotSeller();
        CarrotSeller secondSeller = new CarrotSeller();

        firstSeller.sellerName = "Alfons";
        firstSeller.sellerAddress = "Navrátilova 183, Praha 3";
        firstSeller.dateOfBirth = LocalDate.of(1995,10,11);
        firstSeller.dealsAmount = 312;
        firstSeller.totalSoldCarrotWeight = 1955.3;
        firstSeller.cityOfOrigin = "Prague";
        firstSeller.licenceNumber = "5AB3358";
        firstSeller.fuelConspumtion = 11;

        secondSeller.sellerName = "Pavel";
        secondSeller.sellerAddress = "Evropská 6125, Brno";
        secondSeller.dateOfBirth = LocalDate.of(1983,4,2);
        secondSeller.dealsAmount = 227;
        secondSeller.totalSoldCarrotWeight = 1203;
        secondSeller.cityOfOrigin = "Brno";
        secondSeller.licenceNumber = "1BC45L6";
        secondSeller.fuelConspumtion = 10;

        System.out.println("First sellers name: " + firstSeller.sellerName);
        System.out.println("Second sellers name: " + secondSeller.sellerName);
    }
}