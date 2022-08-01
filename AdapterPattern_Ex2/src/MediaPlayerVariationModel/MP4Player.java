package MediaPlayerVariationModel;

import AdvancedMediaPlayer.AdvancedMediaPlayer;

public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLCPlayer(String fileName) {
        System.out.println("==** Playing VLC Player **==");
    }

    @Override
    public void playMP4Player(String fileName) {
        System.out.println("==** Playing MP4 Player **==");
    }
}
