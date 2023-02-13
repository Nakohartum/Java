package RealEstates;

public class House extends RealEstate{
    private float liveSquare = 0;
    private float kitchenSquare = 0;
    private float gardenSquare = 0;
    private float floors = 0;


    public House(float price, float square, String city, String street, int house, String crossing,
                 float liveSquare, float kitchenSquare, float gardenSquare, float floors) {
        super(price, square, city, street, house, crossing);
        this.liveSquare = liveSquare;
        this.kitchenSquare = kitchenSquare;
        this.gardenSquare = gardenSquare;
        this.floors = floors;
    }

    @Override
    public String getDescription() {
        return "House. Price " + price + ". Square " + square + ". Living square " + liveSquare + ". Kitchen " +
                kitchenSquare + ". Garden " + gardenSquare + ". Floors " + floors;
    }
}