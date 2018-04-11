package stukafluggesellschaftapp;

import stukafluggesellschaftapp.Coordinates.*;

public class City {

     String name;
     String country;
    //from coordinates class
    Coordinates coordinates;
   

    public City(String name, String country, Coordinates coordinates) {
        this.name = name;
        this.country = country;
        this.coordinates=coordinates;
        
    }

   


    

}
