import AudioPlayer.AudioPlayer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("==** Please enter your favourite audio type: ");
        String audioType = scanner.nextLine();

        System.out.print("==** Please enter audio fileName: ");
        String fileName = scanner.nextLine();

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.playMusic(audioType, fileName);
    }
}