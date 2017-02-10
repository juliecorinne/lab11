import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userInput;

        System.out.println("Hello! Welcome to another car list. This is like the last one, but somehow different.");
        System.out.println();

        ArrayList<Car> carList = new ArrayList<Car>();
        ArrayList<Car> carList2 = new ArrayList<Car>();
        ArrayList<CarLot> carLotInfo = new ArrayList<CarLot>();

        lotAvailability(carLotInfo);

        displayCars(carLotInfo);

        do {

        System.out.println("Which list would you like to see?");
        int listNum = scan.nextInt();

        whichList(carList, carList2, listNum);

            System.out.println("Are you interested in another vehicle? y/n");
            scan.nextLine();
            userInput = scan.nextLine();

        } while (userInput.equalsIgnoreCase("y"));

        System.out.println("Bye!");

    }

    public static void whichList(ArrayList<Car> carList, ArrayList<Car> carList2, int listNum) {

        Scanner scan = new Scanner(System.in);

        if (listNum == 1) {

            chevroletList(carList);

            for (int i = 0; i < carList.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, carList.get(i).toString());
            }
            System.out.println();

            System.out.println("Which vehicle would you like to see?");
            int carPick = scan.nextInt();

            System.out.println(carList.get(carPick - 1));
            //extracts the line the user selected
            System.out.println();

        } else {

            fordList(carList2);

            for (int i = 0; i < carList2.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, carList2.get(i).toString());
            }
            System.out.println();

            System.out.println("Which vehicle would you like to see?");
            int carPick = scan.nextInt();

            System.out.println(carList2.get(carPick - 1));
            //extracts the line the user selected
            System.out.println();

        }
    }

    public static void displayCars(ArrayList<CarLot> carLotInfo) {

        for (int i = 0; i < carLotInfo.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, carLotInfo.get(i).toString());
        }
    }

    public static void fordList(ArrayList<Car> carList2) {

        System.out.printf("%1$7s %2$13s %3$11s %4$8s %5$12s\n" ,"Make", "Model", "Year", "Price", "Mileage");
        System.out.println("========================================================");
        System.out.println();

        carList2.add(new Car("Ford", "F150", 2016, 25799.99));
        carList2.add(new Car("Ford", "Explorer", 2017, 32999.99));
        carList2.add(new Car("Ford", "Escape", 2017, 24599.99));
        carList2.add(new UsedCar("Ford", "Escape", 2008, 12999.99, 39700.00));
    }

    public static void chevroletList(ArrayList<Car> carList) {

        System.out.printf("%1$7s %2$13s %3$11s %4$8s %5$12s\n" ,"Make", "Model", "Year", "Price", "Mileage");
        System.out.println("========================================================");
        System.out.println();

        carList.add(new Car("Chevrolet", "Silverado", 2017, 50999.99));
        carList.add(new Car("Chevrolet", "Corvette", 2017, 74899.99));
        carList.add(new Car("Chevrolet", "Cruze", 2017, 24899.99));
        carList.add(new UsedCar("Chevrolet", "Silverado", 2007, 12999.99, 45000.00));
        carList.add(new UsedCar("Chevrolet", "Cruze", 2012, 6899.99, 37000.00));
    }

    public static void lotAvailability(ArrayList<CarLot> carLotInfo) {

        System.out.printf("%1$12s %2$10s %3$13s %4$5s\n" ,"# of cars", "New Cars", "Used Cars", "Make");
        System.out.println("=============================================");

        carLotInfo.add(new CarLot(5, 3, 2, "Chevrolet"));
        carLotInfo.add(new CarLot(4, 3, 1, "Ford"));
    }
}
