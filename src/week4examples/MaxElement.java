package week4examples;

public class MaxElement {
    public static <E extends Comparable <E>> E max(E[] list){
        if(list == null || list.length==0){
            System.out.println("Array must not be a null.");
        }

        E maxElement = list[0]; //Assume that first element is the max element in the list

        for(E element: list){
            if(element.compareTo(maxElement) > 0 ){
                maxElement = element;
            }
        }
        return maxElement;
    }
}
