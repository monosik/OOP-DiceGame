import java.util.Random;
public class Die {

    private Random randomGenerator;
    private int faceValue;

    public Die(){
        randomGenerator = new Random();
    }

    public int roll(){
        this.faceValue = randomGenerator.nextInt(6) + 1;

        return faceValue;
    }

    public int getFaceValue(){
        return faceValue;
    }
}
