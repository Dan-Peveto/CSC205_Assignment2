// create a class for a physical object (a game character)
public class Character {
    // Private field 1
    private CharClass CharClass;
    // Private field 2
    private CharRace CharRace;
    // Private field 3
    private int CharHP;

    // Define an accessor 1 (getter)
    public CharClass getCharClass() {
        return CharClass;
    }
    // Define an accessor 2 (getter)
    public CharRace getCharRace() {
        return CharRace;
    }
    // Define an accessor 3 (getter)
    public int getCharHP() {
        return CharHP;
    }

    // Define a mutator 1 (setter)
    public void setCharClass(CharClass newClass) {
        CharClass = newClass;
    }
    // Define a mutator 2 (setter)
    public void setCharRace(CharRace newRace) {
        CharRace = newRace;
    }
    // Define a mutator 3 (setter)
    public void setCharHP(int newHP) {
        if(newHP >= 0 && newHP <= 20) {
        CharHP = newHP;
        } else {
            System.out.println("Hit Points must be in range bewteen 0 and 20");
        }
    }   
}
