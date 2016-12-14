
public class Dog extends Pet {

    private String mBreed;
    private boolean mRabiesShot = false;

    public Dog(String name, int age, double weight, String breed, boolean hasRabiesShot) {
        super(name, age, weight);
        mBreed = breed;
        mRabiesShot = hasRabiesShot;
    }

    public String getBreed() {
        return mBreed;
    }

    public boolean hasRabiesShot() {
        return mRabiesShot;
    }

    public void setBreed(String breed) {
        this.mBreed = breed;
    }

    public void setRabiesShot(boolean hasRabiesShot) {
        this.mRabiesShot = hasRabiesShot;
    }
}
