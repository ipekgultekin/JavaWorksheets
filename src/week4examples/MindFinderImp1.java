package week4examples;

public class MindFinderImp1 implements MinFinder{

    public Object findMin(Comparable[] a){
        if(a == null || a.length == 0){
            return null;
        }
        Object min = a[0];
        for (int i=0; i<a.length; i++){
            if(a[i].compareTo(min)<0){
                min = a[i];
            }
        }
        return min;
    }
}
