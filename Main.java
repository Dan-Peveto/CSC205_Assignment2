/**
 * DanielPeveto 
 */
// Create a Main class
public class Main {

    public static void main(String[] args) {
        // create enum var and display 1
        CharClass class1 = CharClass.ROGUE;
        System.out.println("The first class is: " + class1);
        // create enum var and display 2
        CharRace race1 = CharRace.HALF_ORC;
        System.out.println("The first race is: " + race1); 
        // create instance of class 1
        Character myChar = new Character();
        // create instance of class 2
        Character yourChar = new Character();
        // use mutators to set all instance variables
        myChar.setCharClass(class1);
        myChar.setCharRace(race1);
        myChar.setCharHP(20);
        yourChar.setCharClass(CharClass.WIZARD);
        yourChar.setCharRace(CharRace.ELF);
        yourChar.setCharHP(1);
        // use getters to display all fields 
        System.out.println("My character's Class is: " + myChar.getCharClass());
        System.out.println("My character's Race is: " + myChar.getCharRace());
        System.out.println("My character's Hit Points are: " + myChar.getCharHP());
        System.out.println("Your character's Class is: " + yourChar.getCharClass());
        System.out.println("Your character's Race is: " + yourChar.getCharRace());
        System.out.println("Your character's Hit Points are: " + yourChar.getCharHP());

    }
}