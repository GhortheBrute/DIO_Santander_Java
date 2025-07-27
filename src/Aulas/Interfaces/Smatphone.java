package Aulas.Interfaces;

public class Smatphone implements VideoPlayer, MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("Computer is Playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Computer is Pausing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Computer is Stopping music");
    }

    @Override
    public void playVideo() {
        System.out.println("Computer is Playing video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Computer is Pausing video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Computer is Stopping video");
    }
}
