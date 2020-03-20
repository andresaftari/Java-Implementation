package DataStructure.musicplayer;

public class MusicItem {
    private String songTitle, singer;
    private int duration;

    public String getSongTitle() {
        return songTitle;
    }

    @Override
    public String toString() {
        return "" +
                "Song title = '" + songTitle + '\'' +
                ", singer = '" + singer + '\'' +
                ", duration = " + duration + " ";
    }

    public MusicItem(String songTitle, String singer, int duration) {
        this.songTitle = songTitle;
        this.singer = singer;
        this.duration = duration;
    }
}
