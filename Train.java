import java.util.ArrayList;

public class Train implements TrainRequirements{
   
    //attributes
    private Engine engine;
    private ArrayList<Car> cars = new ArrayList<Car>();
    private int allCapacity;
    private int allSeatsLeft;
    
    /**
     * Constructor for Train
     * @param cap Train's capacity
     */
    public Train(FuelType f, double curFuel, double maxFuel, int cars, int cap){
        this.engine = new Engine(f, curFuel, maxFuel);
        for (int i = 0; i < cars; i++){
            this.cars.add(new Car(cap));
        }
        this.allCapacity = 0;
        this.allSeatsLeft = 0;

    }

    public Engine getEngine(){
        return this.engine;
    }

    public Car getCar(int i){
        return this.cars.get(i);
    }

    public int getMaxCapacity(){
        return this.allCapacity;
    }

    public int seatsRemaining(){
        return this.allSeatsLeft;
    }

    public void printManifest(){
        System.out.println("Train Manifest:");
        for (int i = 0; i < cars.size(); i++){
            System.out.println("Car " + i + ":");
            cars.get(i).printManifest();
        }
    }

}
