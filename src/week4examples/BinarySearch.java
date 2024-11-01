package week4examples;

public class BinarySearch {
    public static <E extends Comparable<E>> int binarySearch (E[] list, E key){
        int low = 0;
        int high = list.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(key.compareTo(list[mid]) < 0 ){
                high = mid - 1;
            }

            else if(key.compareTo(list[mid]) > 0){
                low = mid + 1;
            }

            else{
                return mid;
            }
        }
        return -1;
    }
}
