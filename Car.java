import java.util.ArrayList;

public class Car implements CarRequirements{

    //attributes
    private ArrayList<Passenger> passengers = new ArrayList<Passenger>();
    private int capacity;
    private int seatsLeft;
    
    /**
     * Constructor for Car
     * @param cap Car's capacity
     */
    public Car(int cap){
        this.capacity = cap;
        this.seatsLeft = cap;
        //initialize passengers arraylist to be the correct length?
    }


    /**
     * Getter for capacity
     * @return Car's capacity
     */
    public int getCapacity(){
        return this.capacity;
    }

    /**
     * Getter for seats remaining
     * @return Car's seats remaining
     */
    public int seatsRemaining(){
        return this.seatsLeft;
    }

    /**
     * Add a passenger to the car if there is room
     * @param p Passenger to add
     * @return true if passenger was added, false otherwise
     */
    public Boolean addPassenger(Passenger p){
        //check if seats available before adding (return true if added, false if not)
        if (this.seatsLeft > 0){
            this.passengers.add(p);
            this.seatsLeft--;
            return true;
        }else{
            return false;
        }
    }

    /**
     * Remove a passenger from the car, if they exist
     * @param p Passenger to remove
     * @return true if passenger was removed, false otherwise
     */
    public Boolean removePassenger(Passenger p){
        if(this.passengers.contains(p)){
            this.passengers.remove(p);
            this.seatsLeft++;
            return true;
        }else{
            return false;
        }
    } 


    /**
     * Print the car's manifest
     */
    public void printManifest(){
        if(this.passengers.size() == 0){
            System.out.println("No passengers in car.");
        }else{
            System.out.println("Car manifest:");
            for (int i = 0; i < this.passengers.size(); i++){
                System.out.println(this.passengers.get(i));
            }
        }
    } 

    public static void main(){
        //to test code
    }

}