package HashTable.SeparateChaining;

public class Separate {
    WordList[] theArray;
    int arraySize;
    
    public String[][] elementsToAdd = {
            {"ace", "Very good"},

            {"act", "Take action"},

            {"add", "Join (something) to something else"},

            {"age", "Grow old"},

            {"ago", "Before the present"},

            {"aid", "Help, assist, or support"},

            {"aim", "Point or direct"},

            {"air", "Invisible gaseous substance"},

            {"all", "Used to refer to the whole quantity"},

            {"amp", "Unit of measure for the strength of an electrical current"},

            {"and", "Used to connect words"}, {"ant", "A small insect"},

            {"any", "Used to refer to one or some of a thing"},

            {"ape", "A large primate"},

            {"apt", "Appropriate or suitable in the circumstances"},

            {"arc", "A part of the circumference of a curve"},

            {"are", "Unit of measure, equal to 100 square meters"},

            {"ark", "The ship built by Noah"},

            {"arm", "Two upper limbs of the human body"},

            {"art", "Expression or application of human creative skill"},

            {"ash", "Powdery residue left after the burning"},

            {"ask", "Say something in order to obtain information"},

            {"asp", "Small southern European viper"},

            {"ass", "Hoofed mammal"},

            {"ate", "To put (food) into the mouth and swallow it"},

            {"atm", "Unit of pressure"},

            {"awe", "A feeling of reverential respect"},

            {"axe", "Edge tool with a heavy bladed head"},

            {"aye", "An affirmative answer"}
    };

    public int stringHashFunction(String wordToHash) {
        int hashKeyValue = 0;

        for (int i = 0; i < wordToHash.length(); i++) {
            // 'a' memiliki character code dalam Java, yaitu '97', jadi kita perlu mengurangi 96 agar array kita dimulai
            // dari 1
            int charCode = wordToHash.charAt(i) - 97;

            int hashKeyValueTemp = 0;

            // Hitung hash key menggunakan 26 huruf beserta blank char
            hashKeyValue = (hashKeyValue * 27 + charCode) % arraySize;

            System.out.println("Hash Key Value " + hashKeyValueTemp + " * 27 + Character code " + charCode + " % arraySize " + arraySize + " = " + hashKeyValue);
        }
        System.out.println();
        return hashKeyValue;
    }

    Separate(int size) {
        arraySize = size;
        theArray = new WordList[size];

        for (int i = 0; i < arraySize; i++)
            theArray[i] = new WordList();

        addTheArray(elementsToAdd);
    }

    void insert(Word newWord) {
        String wordToHash = newWord.theWord;

        // Hitung hashKey untuk Word
        int hashKey = stringHashFunction(wordToHash);

        // Tambahkan new word ke array dan jadikan key sebagai keyword
        theArray[hashKey].insert(newWord, hashKey);
    }

    void addTheArray(String[][] elementsToAdd) {
        for (String[] elements: elementsToAdd) {
            String word = elements[0];
            String definition = elements[1];

            // Jadikan Word berupa word name dan definisinya
            Word newWord = new Word(word, definition);
            insert(newWord);
        }
    }

    public Word findKey(String wordToFind) {
        // Hitung hashKey untuk Word
        int hashKey = stringHashFunction(wordToFind);
        return theArray[hashKey].find(hashKey, wordToFind);
    }

    void displayArray() {
        for (int i = 0; i < arraySize; i++) {
            System.out.println("theArray index " + i);
            theArray[i].displayWordList();
        }
    }
}
