/**
 * Created by julieschneider on 2/10/17.
 */
public class CarLot {

    private int numOfCars;
    private int newCars;
    private int usedCars;
    private String carBrand;

    public CarLot(int numOfCars, int newCars, int userCars, String carBrand) {
        this.numOfCars = numOfCars;
        this.newCars = newCars;
        this.usedCars = userCars;
        this.carBrand = carBrand;
    }

    public int getNumOfCars() {
        return numOfCars;
    }

    public void setNumOfCars(int numOfCars) {
        this.numOfCars = numOfCars;
    }

    public int getNewCars() {
        return newCars;
    }

    public void setNewCars(int newCars) {
        this.newCars = newCars;
    }

    public int getUserCars() {
        return usedCars;
    }

    public void setUserCars(int userCars) {
        this.usedCars = userCars;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String toString(){
        return String.format("%1$-11s %2$-12s %3$-10s %4$-10s\n", numOfCars, newCars, usedCars, carBrand);
    }
}
