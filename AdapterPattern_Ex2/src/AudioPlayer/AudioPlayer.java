package AudioPlayer;

import MediaAdapter.MediaAdapter;
import MediaPlayer.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void playMusic(String audioType, String fileName) {
        if(audioType.toUpperCase().equals("MP3")) {
            System.out.println("==** Playing MP3 Music **==");
        } else if (audioType.toUpperCase().equals("MP4") || audioType.toUpperCase().equals("VLC")) {
            this.mediaAdapter = new MediaAdapter(audioType);
            this.mediaAdapter.playMusic(audioType, fileName);
        } else {
            System.out.println("==** Given Format is not Supported **==");
        }
    }
}
