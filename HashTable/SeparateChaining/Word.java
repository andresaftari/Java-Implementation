package JawabanSoalTeori.SeparateChaining;

class Word {
    public String theWord, definition;
    public int key;

    // Reference terhadap Word setelahnya yang dibuat dalam WordList

    public Word next;

    public Word(String theWord, String definition) {
        this.theWord = theWord;
        this.definition = definition;
    }

    public String toString() {
        return theWord + " : " + definition;
    }
}
