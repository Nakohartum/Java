package RealEstate;

public class RealEstate {
    protected float price = 0;
    protected float square = 0;
    protected String city = "";
    protected String street = "";
    protected int house = 0;
    protected String crossing = "";

    public RealEstate(float price, float square, String city, String street, int house, String crossing){
        this.price = price;
        this.square = square;
        this.city = city;
        this.street = street;
        this.house = house;
        this.crossing = crossing;
    }

    public float getPrice(){
        return price;
    }

    public float getSquare(){
        return square;
    }

    public String getCity(){
        return city;
    }

    public String getStreet(){
        return street;
    }

    public int getHouse(){
        return house;
    }

    public String getCrossing(){
        return crossing;
    }

    public void setPrice(float value){
        price = value;
    }

    public void setSquare(float value){
        square = value;
    }

    public void setCity(String value){
        city = value;
    }

    public void setStreet(String value){
        street = value;
    }

    public void setHouse(int value){
        house = value;
    }

    public void setCrossing(String value){
        crossing = value;
    }

    public float getPricePerSquareMeter(){
        return price / square;
    }

    public String getShortAddress(){
        return "Street " + street + "," + house;
    }

    public String getFullAddress(){
        return "City: " + city + ". Street: " + street + "," + house;
    }

    public String getDescription(){
        return "" + square;
    }
}
