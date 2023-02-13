package RealEstates;

public class Office extends RealEstate{

    private int rooms = 0;
    private String businessCenterName = "";
    private int officeNumber = 0;

    public Office(float price, float square, String city, String street, int house, String crossing,
                  int rooms, String businessCenterName, int officeNumber) {
        super(price, square, city, street, house, crossing);
        this.rooms = rooms;
        this.businessCenterName = businessCenterName;
        this.officeNumber = officeNumber;
    }

    @Override
    public String getDescription() {
        return "Office. Price " + price + ". Rooms " + rooms + ". Square " + square + ". " +
                "Business center " + businessCenterName + ". Office number " + officeNumber;
    }
}