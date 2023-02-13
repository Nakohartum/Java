import Comparators.*;
import RealEstates.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<RealEstate> realEstates = new ArrayList<RealEstate>();
        for (int i = 0; i < 50; i++){
            var number = random.nextInt();
            if (number < 0){
                realEstates.add(new House(random.nextFloat() * 1000, random.nextFloat() * 500, "Aktobe",
                        "ss", random.nextInt(), "ss",
                        random.nextFloat() * 100, random.nextFloat() * 100, random.nextFloat() * 100,
                        random.nextInt(2) + 1));
            }
            else if (number > 0){
                realEstates.add(new Office(random.nextFloat() * 1000, random.nextFloat() * 500, "Aktobe",
                        "ss", random.nextInt(), "ss",
                        random.nextInt(4) + 1, "ss", random.nextInt(99) + 1));
            }
        }
        String symbol;
        do {
            System.out.print("Do you want to look through the list? Write 'yes' or 'no': ");
            symbol = scanner.next();
            System.out.println("----------------------------------");
            for (int i = 0; i < realEstates.size(); i++) {
                System.out.println(realEstates.get(i).getDescription());
            }
            System.out.println("----------------------------------");
            int choose = 0;
            do {
                System.out.print("What do you want to do? \n1-Sort by price asc \n2-Sort by price desc \n3-Sort by price per meter asc" +
                        "\n4-Sort by price per meter desc \n5-Sort by square asc \n6-Sort by square desc \nWrite number:");
                if (scanner.hasNextInt()) {
                    choose = scanner.nextInt();
                }
                if (choose < 1 && choose > 6) {
                    System.out.print("Try again. Write number from 1 to 6:");
                }
            } while (!(choose > 0 && choose < 6));

            switch (choose) {
                case 1:
                    realEstates.sort(new RealEstateByPriceAscComparator());
                    break;
                case 2:
                    realEstates.sort(new RealEstateByPriceDescComparator());
                    break;
                case 3:
                    realEstates.sort(new RealEstateByPricePerMeterAscComparator());
                    break;
                case 4:
                    realEstates.sort(new RealEstateByPricePerMeterDescComparator());
                    break;
                case 5:
                    realEstates.sort(new RealEstateBySquareAscComparator());
                    break;
                case 6:
                    realEstates.sort(new RealEstateBySquareDescComparator());
                    break;
            }
        }while(!symbol.equals("no"));
    }
}