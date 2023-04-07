package DataStructure.musicplayer;

// Kita perlu membuat Plain Old Java Object (POJO) sebagai Generic class yang membawa data object dari element-element
// yang akan kita gunakan
public class MusicItem {
    private String songTitle, singer;
    private int duration;

    // Buatkan Constructor untuk menyimpan parameter yang akan digunakan sebagai method untuk menyimpan nilai
    public MusicItem(String songTitle, String singer, int duration) {
        this.songTitle = songTitle;
        this.singer = singer;
        this.duration = duration;
    }

    // Buatkan Getter sebagai alat yang akan kita gunakan saat memanggil element ini
    public String getSongTitle() {
        return songTitle;
    }

    // Buatkan toString() method sebagai kalimat yang akan keluar saat object kita lakukan pemanggilan (kata-katanya
    // bebas, tidak harus sama)
    @Override
    public String toString() {
        return "" +
                "Song title = '" + songTitle + '\'' +
                ", singer = '" + singer + '\'' +
                ", duration = " + duration + " ";
    }
}
