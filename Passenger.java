public class Passenger implements PassengerRequirements{
    
    //attributes
    private String name;

    //constructor
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Getter for name
     * @return Passenger's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Call addPassenger to board the car
     * @param c Car to board
     * @return true if passenger boards, false otherwise
     */
    public void boardCar(Car c) {
        c.addPassenger(this);
    }

    /**
     * Call removePassenger to get off the car
     * @param c Car to get off
     * @return true if passenger gets off, false otherwise
     */ 
    public void getOffCar(Car c) {
        c.removePassenger(this);
    }


}
