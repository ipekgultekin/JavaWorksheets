package week4examples;

public class Square extends BGeometricObject implements Colorable{
    public Square(){

    }

    public Square(String color, boolean filled){
        super(color,filled);
    }


    /*
    methods
     */
    @Override
    public void howToColor(){
        System.out.println("color all four sides.");
    }
}
