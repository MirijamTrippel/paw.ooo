import java.util.ArrayList;

public class Main {

    ArrayList<Block> blockChain = new ArrayList<>();

    public static void main(String[] args){

        String[] anchorObject = {"Paws are the best!", "This is my first block chain concept xD", "The name paw.ooo comes from paw and the howl Awooo"};
        int anchorSignature = 91121;
        Block anchorBlock = new Block(anchorSignature,anchorObject);
        //636360765
        System.out.println(anchorBlock.getBlockSignature());

    }
}