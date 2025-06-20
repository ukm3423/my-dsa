package practice.solid.isp;

interface AudioPlayable {
    void playAudio();
}

interface VideoPlayable {
    void playVideo();
}

interface LiveStreamable {
    void streamLive();
}

class AudioPlayer implements AudioPlayable {
    public void playAudio() {
        System.out.println("🎵 Playing audio");
    }
}

class VideoPlayer implements VideoPlayable {
    public void playVideo() {
        System.out.println("🎬 Playing video");
    }
}

class LiveStreamPlayer implements AudioPlayable, VideoPlayable, LiveStreamable {
    public void playAudio() {
        System.out.println("🎧 Live stream audio");
    }

    public void playVideo() {
        System.out.println("📺 Live stream video");
    }

    public void streamLive() {
        System.out.println("🔴 Streaming live now...");
    }
}

public class Main {
    public static void main(String[] args) {
        AudioPlayable audioPlayer = new AudioPlayer();
        audioPlayer.playAudio();

        VideoPlayable videoPlayer = new VideoPlayer();
        videoPlayer.playVideo();

        LiveStreamPlayer livePlayer = new LiveStreamPlayer();
        livePlayer.playAudio();
        livePlayer.playVideo();
        livePlayer.streamLive();
    }
}
