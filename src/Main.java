import RealEstate.Office;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Office office = new Office(2000000, 20.0f, "Aktobe", "Alia avenue", 1, "Alia"
                , 3, "Ilyas", 4);
        System.out.println(office.getDescription());
        System.out.println(office.getFullAddress());
    }
}