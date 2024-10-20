package week2examples;

public class QuadraticEquation {
    private int a, b, c;
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }

    public int getDiscriminant(){
        return (b*b)-(4*a*c);
    }

    public double getRoot1(){
        double discriminant = getDiscriminant();
        if (discriminant<0){
            return 0;
        }
        return -b+Math.sqrt((b*b)-(4*a*c))/(2*a);
    }
    public double getRoot2(){
        double discriminant = getDiscriminant();
        if (discriminant<0){
            return 0;
        }
        return -b+Math.sqrt((b*b)-(4*a*c))/(2*a);

    }
}
