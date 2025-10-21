package Week_4_Set_1;

interface Playable {
    void play();
    void pause();
}

class AudioPlayer implements Playable {
    private String track;
    public AudioPlayer(String track){ this.track = track; }
    @Override public void play(){ System.out.println("Playing audio: " + track); }
    @Override public void pause(){ System.out.println("Pausing audio: " + track); }
}

class VideoPlayer implements Playable {
    private String video;
    public VideoPlayer(String video){ this.video = video; }
    @Override public void play(){ System.out.println("Playing video: " + video); }
    @Override public void pause(){ System.out.println("Pausing video: " + video); }
}

public class PlayableDemo {
    public static void main(String[] args){
        Playable[] items = new Playable[] {
                new AudioPlayer("song.mp3"),
                new VideoPlayer("movie.mp4")
        };
        for(Playable p : items){ p.play(); p.pause(); }
    }
}
