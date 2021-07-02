public class vehicleUse {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.color = "Red";
        v.setMaxSpedd(120);
        v.print(); 

        car c = new car();
        c.numGears = 10;
        c.color = "Black";
        c.setMaxSpedd(110);
        c.print();

        c.printCar();
    }
}
