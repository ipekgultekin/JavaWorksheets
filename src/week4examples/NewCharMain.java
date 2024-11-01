package week4examples;

public class NewCharMain {
    public static void main(String[] args){
        String sentence = "Interface and abstract classes are very hard topics.";
        ReservedCharSequence reserved = new ReservedCharSequence(sentence);

        System.out.println("Original sentence: " + sentence);
        System.out.println("Reserved sentence: " + reserved.toString());
    }
}
