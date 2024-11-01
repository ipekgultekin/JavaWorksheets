package week4examples;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList<Colorable> arrayList = new ArrayList<>();
        arrayList.add(new Square("Red",true));
        arrayList.add(new Square("Yellow",false));

        for(Colorable colorable: arrayList){
            colorable.howToColor();
        }
    }
}
