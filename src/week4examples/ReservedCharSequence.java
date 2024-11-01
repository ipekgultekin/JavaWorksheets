package week4examples;

public class ReservedCharSequence implements CharSequence{
    private final String original;

    public ReservedCharSequence(String original){
        this.original = original;
    }

    @Override
    public int length(){
        return original.length();
    }

    @Override
    public char charAt(int index){
        return original.charAt(original.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end){
        StringBuilder subSeq = new StringBuilder();
        for (int i= end-1; i>=start; i--){
            subSeq.append(original.charAt(i));
        }
        return subSeq.toString();
    }

    @Override
    public String toString() {
        return new StringBuilder(original).reverse().toString();
    }
}
