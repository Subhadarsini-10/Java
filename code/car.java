public class car extends vehicle {
    int numGears;
    boolean isConvertible;

    public void printCar(){
        System.out.println("Color: " + color);
        System.out.println("maxSpeed: " + getMaxSpeed());
        System.out.println("NumGears: " + numGears);
        System.out.println("isConvertible: " + isConvertible);
    }
}
