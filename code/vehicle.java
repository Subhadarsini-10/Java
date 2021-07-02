public class vehicle {
    String color;
    private int maxSpeed;

    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpedd(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void print(){
        System.out.println("Color :" + color);
        System.out.println("maxSpeed :" + maxSpeed);
    }
}
