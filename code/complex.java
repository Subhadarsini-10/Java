public class complex {
    private int real;
    private int imaginary;

    public complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public int getImaginary(){
        return imaginary;
    }
    public int getReal(){
        return real;
    }
    public void setImaginary(int imaginary){
        this.imaginary = imaginary;
    }
    public void setReal(int real){
        this.real = real;
    }
    public void print(){
        System.out.println(this.real+"+"+ " i"+ this.imaginary);
    }
    public static complex add(complex c1, complex c2){
        complex temp = new complex(0, 0);
        temp.imaginary = c1.imaginary + c2.imaginary;
        temp.real = c1.real + c2.real;
        return temp;
    }
    public void add(complex c2){
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }
    public void multiply(complex c2){
        this.real = this.real*c2.real - this.imaginary*c2.imaginary;
        this.imaginary = this.real*c2.imaginary + this.imaginary*c2.real;
    }
    
}
