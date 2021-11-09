import java.util.Arrays;

public class Block {

    private int previousSignature;
    //DataStructure of my choice
    private String[] object;
    private int blockSignature;

    public Block(int previousSignature, String[] object) {
        this.previousSignature = previousSignature;
        this.object = object;
        //Array of 2 hashes, one from the current data/object/transaction/etc, one from the previous Block
        Object[] hashBase = {Arrays.hashCode(object), previousSignature};
        this.blockSignature = Arrays.hashCode(hashBase);
    }

    public int getPreviousSignature() {
        return previousSignature;
    }

    public String[] getObject() {
        return object;
    }

    public int getBlockSignature() {
        return blockSignature;
    }

}
