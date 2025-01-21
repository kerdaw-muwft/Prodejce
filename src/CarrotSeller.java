import java.time.LocalDate;

public class CarrotSeller {

    private String sellerName; //name of the seller
    private String sellerAddress; // address of the seller
    private LocalDate dateOfBirth; // Sellers Date of birth
    private int dealsAmount; //the amount of negotiated deals
    private double totalSoldCarrotWeight; // total weight of sold carrots in tonnes
    private String cityOfOrigin; // the city the carrot seller is based in
    private String licenceNumber; // SPZ
    private double fuelConspumtion; // Amount of fuel consumed per 100km

    public String getSellerName() {
        return sellerName;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public double getTotalSoldCarrotWeight() {
        return totalSoldCarrotWeight;
    }

    public int getDealsAmount() {
        return dealsAmount;
    }

    public String getCityOfOrigin() {
        return cityOfOrigin;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public double getFuelConspumtion() {
        return fuelConspumtion;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setTotalSoldCarrotWeight(double totalSoldCarrotWeight) {
        this.totalSoldCarrotWeight = totalSoldCarrotWeight;
    }

    public void setDealsAmount(int dealsAmount) {
        this.dealsAmount = dealsAmount;
    }

    public void setCityOfOrigin(String cityOfOrigin) {
        this.cityOfOrigin = cityOfOrigin;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public void setFuelConspumtion(double fuelConspumtion) {
        this.fuelConspumtion = fuelConspumtion;
    }
}
