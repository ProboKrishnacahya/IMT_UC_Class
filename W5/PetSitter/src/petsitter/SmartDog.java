package petsitter;

/**
 *
 * @author Probo Krishnacahya (0706012010039)
 */
public class SmartDog extends Dog {

    private int intelligence;

    public SmartDog() {
        super();
    }

    @Override
    public void play() {
        super.play();
        intelligence -= 1;
        System.out.println("You are in SmartDog");
    }

    public void learn() {
        intelligence += 1;
        if (intelligence > 5) {
            intelligence = 5;
            System.out.println("I am too smart");
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

}
