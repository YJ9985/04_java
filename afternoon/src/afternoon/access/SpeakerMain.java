
package afternoon.access;

import afternoon.Speaker;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker();

        speaker.volumeUp();
        speaker.getVolume();

        speaker.volumeDown();
        speaker.getVolume();

        speaker.volumeMute();
        speaker.getVolume();

        speaker.volumeDown();
        speaker.getVolume();

        speaker.volumeUp();
        speaker.getVolume();


    }
}
