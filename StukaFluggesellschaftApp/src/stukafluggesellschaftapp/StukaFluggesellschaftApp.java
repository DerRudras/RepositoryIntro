package stukafluggesellschaftapp;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.lang.System.*;    


public class StukaFluggesellschaftApp {

    static Airplane[] arrayOfAirplanes = new Airplane[10];
    static City[] arrayOfCities = new City[10];

    public static void main(String[] args) {

        
        
        //System.out.printf("%b",Computations.isRangeEnough(arrayOfAirplanes[0].range,(Computations.distanceCities(59.57, 10.45, 38.43, 9.08))));
        
        arrayOfAirplanes[0] = new Airplane("Boeing 747-8", new Capacity(426_109, 14320, 447_700), 800, 2005, "Passenger",1400);
        arrayOfAirplanes[1] = new Airplane("Antonov An-225", new Capacity());
        arrayOfAirplanes[2] = new Airplane("Airbus A380", new Capacity(5000, 4000, 300));
        arrayOfCities[0] = new City("Oslo", "Norway", new Coordinates(59.57, 10.45));
        arrayOfCities[1] = new City("Saint Petersburg", "Russia", new Coordinates(59.57, 30.18));
        arrayOfCities[2] = new City("Lisbon", "Portugal", new Coordinates(38.43, 9.08));
        arrayOfCities[3] = new City("Kyoto", "Japan", new Coordinates(35.01, 135.46));
        arrayOfCities[4] = new City("Auckland", "New Zealand", new Coordinates(36.50, 174.44));
        arrayOfCities[5] = new City("Los Angeles", "USA", new Coordinates(34.10, 118.15));
        
        List<Airplane> listOfAirplanes=new ArrayList();
        listOfAirplanes.addAll(Arrays.asList(arrayOfAirplanes));
        System.out.println(listOfAirplanes.get(0));
        System.out.println(listOfAirplanes.size());
        
       
        System.out.printf("Number of planes:%d\n", Airplane.counter);
        double distanceLisbonOslo=Computations.distanceCities(59.57, 10.45, 38.43, 9.08);
        System.out.printf("%s%.2f%s", "Distance between Oslo and Lisbon:", distanceLisbonOslo, " Kms\n");
        String outcome1=Computations.isRangeEnough(arrayOfAirplanes[2].range,(int)distanceLisbonOslo);
        System.out.printf("%s %s %s %s",arrayOfAirplanes[2].model,  outcome1,"Lisbon","to Oslo");
        
    
    /*
    City Oslo = new City("Oslo", "Norway", new Coordinates(59.57, 10.45));
    City Saint_Petersburg = new City("Saint Petersburg", "Russia", new Coordinates(59.57, 30.18));
    City Lisbon = new City("Lisbon", "Portugal", new Coordinates(38.43, 9.08));
    City Kyoto = new City("Kyoto", "Japan", new Coordinates(35.01, 135.46));
    City Auckland = new City("Auckland", "New Zealand", new Coordinates(36.50, 174.44));
    City Los_Angeles = new City("Los Angeles", "USA", new Coordinates(34.10, 118.15));
    Airplane plane1 = new Airplane("Antonov An-225", new Capacity());
    Airplane plane2 = new Airplane("Airbus A380", new Capacity(5000, 4000, 300));
    Airplane plane3 = new Airplane("Boeing 747-8", new Capacity(426_109, 14320, 447_700), 800, 2005, "Passenger");
    System.out.printf("%s",plane3.type);*/
    }
}
