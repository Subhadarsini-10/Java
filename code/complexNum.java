public class complexNum {
    public static void main(String[] args) {
        complex c1 = new complex(2, 3);
        c1.print();

        c1.setReal(10);
        c1.setImaginary(20);
        c1.print();

        complex c2 = new complex(1, 5);
        c1.add(c2);
        c1.print();
        c2.print();

        complex c3 = new complex(3, 2);
        c2.multiply(c3);
        c2.print();
        c3.print();

        //complex c4 = new complex.add(c1, c3);
        //c1.print();
        //c3.print();
        //c4.print();
    }
}
