package DataStructure.musicplayer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MusicPlayer {
    LinkedList<MusicItem> list = new LinkedList<>();

    public MusicPlayer(String nama) {
        System.out.println("Music Player: " + nama + " dibuat");
    }

    // Untuk menambah lagu, buat method addSong seperti berikut
    public void addSong(String song, String singer, int duration) {
        list.add(new MusicItem(song, singer, duration));   //(1)
        // Untuk menambah, kita gunakan method pada List yaitu LinkedList.add()
    }

    public void deleteSong(String title) {
        // Pada soal diminta untuk menggunakan method berikut : Iterator<MusicItem> iterator = list.iterator(); (2)
        // Sebenarnya tidak perlu karena dalam List ataupun Array, kita dapat menggunakan Foreach untuk mengurangi
        // banyaknya looping
        for (MusicItem songDeleted : list) {
            if (songDeleted.getSongTitle().equals(title)) {
                // Pada method ini, penghapusan menggunakan title yang artinya kita perlu mencari isi LinkedList yang
                // judulnya sama dengan yang ingin dihapus, untuk itu kita lakukan looping, lalu apabila judul lagu yang
                // berada di index ke-n sama dengan sama seperti yang dicari lakukan :
                list.remove();
                // list.remove() untuk menghapus 1 lagu tersebut dan berikan statement :
                System.out.println("Lagu removed " + title); //(3)
            }
        }
    }

    public MusicItem deleteDepan() {
        // Pada soal diminta untuk menggunakan method berikut : MusicItem removedSong = list.getFirst(); (4)
        // Sebenarnya, kita tidak perlu memanggil lagi Generic class Musicitem, karena kita dapat memanggil langsung
        // variable LinkedList kita yang sudah membawa data dari MusicItem
        return list.removeFirst();
        // Untuk memanggil Linkedlist, kita cukup memanggil variable nya, yaitu "list" dan untuk menghapus head dari
        // LinkedList dapat digunakan removeFirst()
    }

    // Pada method ini, tujuannya adalah memainkan lagu dari index 1 sampai index terakhir (maju ke depan)
    public void playMusic() {
        ListIterator<MusicItem> iterator = list.listIterator(); //(5)
        // Untuk memulai perhitungan iterasi, kita gunakan ListIterator untuk automatic Iteration, sehingga saat lagu
        // sudah dimainkan, maka program dapat maju ke lagu berikutnya
        int i = 1;
        // Inisiasikan iterasi sebagai = 1, artinya mulai dari index 1
        while (iterator.hasNext()) {   //(6)
            System.out.println("Memainkan lagu ke- " + i);
            System.out.println(iterator.next());
            // Setelah memainkan iterasi 1, maka iterator akan berpindah ke List Node selanjutnya
            i++;
            // Lalu sebelum while looping selesai, lakukan increment terhadap index (i)
        }
    }

    // Pada method ini, tujuannya adalah memainkan lagu dari index terakhir sampai index 1 (mundur ke belakang)
    public void playMusicBackward() {
        Iterator<MusicItem> iterator = list.iterator();   //(7)
        // Untuk memulai perhitungan iterasi, kita gunakan ListIterator untuk automatic Iteration, sehingga saat lagu
        // sudah dimainkan, maka program dapat maju ke lagu berikutnya
        int i = 1;
        // Inisiasikan iterasi sebagai = 1, artinya mulai dari index 1
        while (iterator.hasNext()){   //(8)
            System.out.println("Memainkan lagu ke- " + i);
            System.out.println(iterator.next());
            // Setelah memainkan iterasi 1, maka iterator akan berpindah ke List Node selanjutnya
            i--; //(9)
            // Lalu sebelum while looping selesai, lakukan decrement terhadap index (i)
        }
    }
}

