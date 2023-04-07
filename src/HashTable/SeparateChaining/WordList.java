package HashTable.SeparateChaining;

import java.io.*;

public class WordList {
    // Reference terhadap Link pertama dalam list
    // Last Link ditambahkan ke dalam LinkedList
    public Word firstWord = null;

    void insert(Word newWord, int hashKey) {
        Word previous = null;
        Word current = firstWord;

        newWord.key = hashKey;

        while (current != null && newWord.key > current.key) {
            previous = current;
            current = current.next;
        }

        if (previous == null)
            firstWord = newWord;
        else previous.next = newWord;

        newWord.next = current;
    }

    void displayWordList() {
        Word current = firstWord;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    Word find(int hashKey, String wordToFind) {
        Word current = firstWord;

        // Mencari key, dengan syarat :
        // 1. Stop searching apabila hashKey < key yang kita cari
        // 2. List is sorted, so... stop pencarian saat key ditemukan :)

        while (current != null && current.key <= hashKey) {
            if (current.theWord.equals(wordToFind))
                return current;
            current = current.next;
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Jadikan 11 item array untuk menampung masing-masing kalimat dengan definisinya
        Separate wordHashTable = new Separate(11);

        String wordLookUp = "a";
        // Terus jalankan request sampai "x" dimasukkan
        while (!wordLookUp.equalsIgnoreCase("x")) {
            System.out.print(" : ");

            wordLookUp = br.readLine();
            // Cari requested word dan cetak itu
            System.out.println(wordHashTable.findKey(wordLookUp));
        }

        // Tampilkan setiap item dalam array yang terkait
        wordHashTable.displayArray();
    }
}


