package Comparators;

import RealEstates.RealEstate;

import java.util.Comparator;

public class RealEstateByPricePerMeterDescComparator implements Comparator<RealEstate> {

    @Override
    public int compare(RealEstate o1, RealEstate o2) {
        var result = 0;
        if (o1.getPricePerSquareMeter() > o2.getPricePerSquareMeter()){
            result = -1;
        }
        else if (o1.getPricePerSquareMeter() < o2.getPricePerSquareMeter()){
            result = 1;
        }
        return result;
    }
}
