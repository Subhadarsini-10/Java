public class multiplication {
    
    public static int product(int x, int y){

        if( x < y){
            return product(x, y);
        }
        else if( y != 0){
            return (x + product(x, y-1));
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int x = 5, y=3;
        System.out.println(product(x, y));
    }
}
