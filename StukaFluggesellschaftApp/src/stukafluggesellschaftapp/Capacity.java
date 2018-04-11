package stukafluggesellschaftapp;

public class Capacity {

    double fuel_capacity;
    int passenger_capacity;
    int payload;

    public Capacity()
    {
        this(1000);
    }
    public Capacity(double fuel_capacity)
    {
        this(fuel_capacity,500);
        
    }
    public Capacity(double fuel_capacity,int passenger_capacity)
    {
        this(fuel_capacity,passenger_capacity,5000);
    }
    
    public Capacity(double fuel_capacity, int passenger_capacity,int payload) {
        this.fuel_capacity = fuel_capacity;
        this.passenger_capacity = passenger_capacity;
        this.payload=payload;
    }
}
