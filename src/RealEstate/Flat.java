package RealEstate;

public class Flat extends RealEstate {

    private int rooms = 0;
    private float liveSquare = 0;
    private float kitchenSquare = 0;
    private int floor = 0;
    private int totalFloors = 0;
    private int apartment = 0;

    public Flat(float price, float square, String city, String street, int house, String crossing,
                int rooms, float liveSquare, float kitchenSquare, int floor, int totalFloors, int apartment) {
        super(price, square, city, street, house, crossing);
        this.rooms = rooms;
        this.liveSquare = liveSquare;
        this.kitchenSquare = kitchenSquare;
        this.floor = floor;
        this.totalFloors = totalFloors;
        this.apartment = apartment;
    }

    public int getRooms(){
        return rooms;
    }

    public float getLiveSquare(){
        return liveSquare;
    }

    public float getKitchenSquare(){
        return kitchenSquare;
    }

    public int getFloor(){
        return floor;
    }

    public int getTotalFloors(){
        return totalFloors;
    }

    public int getApartment(){
        return apartment;
    }

    @Override
    public String getDescription() {
        return "Flat number " + apartment + "," + " price " + "rooms count, " + "square " + square + ", " +
                "living square " + liveSquare + ", kitchen square " +
                kitchenSquare + ", floor " + floor + ", total floors " + totalFloors + ".";
    }


}
