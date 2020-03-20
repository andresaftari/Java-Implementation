package DataStructure.musicplayer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MusicPlayer {
    LinkedList<MusicItem> list = new LinkedList<>();

    public MusicPlayer(String nama) {
        System.out.println("Music Player: " + nama + " dibuat");
    }

    public void addSong(String song, String singer, int duration) {
        list.add(new MusicItem(song, singer, duration));   //(1)
    }

    public void deleteSong(String song) {
        // Iterator<MusicItem> iterator = list.iterator(); (2)
        // Saya ubah menjadi Foreach agar lebih efisien
        for (MusicItem songDeleted : list) {
            if (songDeleted.getSongTitle().equals(song)) {
                System.out.println("Lagu removed " + song);        //(3)
            }
        }
    }

    public MusicItem deleteDepan() {
        //MusicItem removedSong = list.getFirst(); (4)
        // Saya ubah menjadi inline code agar lebih efisien
        return list.getFirst();
    }

    public void playMusic() {
        ListIterator<MusicItem> iterator = list.listIterator(); //(5)

        int i = 1;
        while (iterator.hasNext()) {                   //(6)
            System.out.println("Memainkan lagu ke- " + i);
            System.out.println(iterator.next());
            i++;
        }
    }

    public void playMusicBackward() {
        Iterator<MusicItem> iterator = list.iterator();   //(7)

        int i = 1;
        while (iterator.hasNext()){                        //(8)
            System.out.println("Memainkan lagu ke- " + i);
            System.out.println(iterator.next());
            i--; //(9)
        }
    }
}

