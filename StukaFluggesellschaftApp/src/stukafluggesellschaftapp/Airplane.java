package stukafluggesellschaftapp;

import stukafluggesellschaftapp.Capacity.*;

public class Airplane {

    String model;

    /*/Capacity 
    private double fuel_capacity;
    private int passenger_capacity;
    private int payload;
     */
    Capacity capacity;
    int range;
    public String type;
    int max_speed;
    int year;
    static int counter;

    public Airplane() {
        this("Prototype");
    }

    public Airplane(String model) {
        this(model, new Capacity(1200, 1000, 15_000));
    }

    public Airplane(String model, Capacity capacity) {
        this(model, capacity, 200);
    }

    public Airplane(String model, Capacity capacity, int max_speed) {
        this(model, capacity, max_speed, 1980);
    }

    public Airplane(String model, Capacity capacity, int max_speed, int year) {
        this(model,capacity, max_speed,year,"Passenger");

    }

    public Airplane(String model, Capacity capacity, int max_speed, int year, String type  )
    {
         this(model,capacity, max_speed,year,type,1300); 

    }

    public Airplane(String model, Capacity capacity, int max_speed, int year, String type,int range  )
            {
    this.model=model;
          this.capacity=capacity;
          this.max_speed=max_speed;
          this.year=year;
          this.type=type;
          this.range=range;
          counter++;
}
    
   
    
    

}
