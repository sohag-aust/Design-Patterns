package MediaAdapter;

import AdvancedMediaPlayer.AdvancedMediaPlayer;
import MediaPlayer.MediaPlayer;
import MediaPlayerVariationModel.MP4Player;
import MediaPlayerVariationModel.VLCPlayer;
import MediaTypes.MediaType;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        MediaType mediaType = MediaType.valueOf(audioType.toUpperCase());

        switch (mediaType) {
            case MP4:
                this.advancedMediaPlayer = new MP4Player();
                break;

            case VLC:
                this.advancedMediaPlayer = new VLCPlayer();
                break;
        }
    }

    @Override
    public void playMusic(String audioType, String fileName) {
        MediaType mediaType = MediaType.valueOf(audioType.toUpperCase());

        switch (mediaType) {
            case MP4:
                advancedMediaPlayer.playMP4Player(fileName);
                break;

            case VLC:
                advancedMediaPlayer.playVLCPlayer(fileName);
                break;
        }
    }
}
