package DataStructure.musicplayer;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer("Music Player 1");

        musicPlayer.addSong("Memories", "Maroon 5",5);
        musicPlayer.addSong("Yellow", "Coldplay",4);
        musicPlayer.addSong("Something Just Like This", "The chainsmoker & coldplay",6);
        musicPlayer.addSong("Kun Anta", "Humood",5);

        musicPlayer.playMusic();

        musicPlayer.deleteSong("Kun Anta");
        MusicItem removed = musicPlayer.deleteDepan();
        System.out.println("Lagu removed "+ removed);

        musicPlayer.playMusic();
        musicPlayer.playMusicBackward();
    }
}
