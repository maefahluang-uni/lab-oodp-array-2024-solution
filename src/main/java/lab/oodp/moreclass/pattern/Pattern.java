package lab.oodp.moreclass.pattern;

public class Pattern {

    private int numRepeats;
    private char character;

    public Pattern(int numRepeats, char character) {
        // TODO: Implement the constructor
        this.numRepeats = numRepeats;
        this.character = character;
    }

    public int getNumberOfCharacters() {
        return numRepeats;
    }

    public void setNumberOfCharacters(int numRepeats) {
        this.numRepeats = numRepeats;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    @Override
    public String toString() {
        String s = "";
       
         // TODO: Implement the toString() method
        for (int i = 0; i < numRepeats; i++) {
            s += character;
            
        }
        return s;
    }
}
