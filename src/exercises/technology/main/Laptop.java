package exercises.technology.main;

public class Laptop extends Computer {
    // Class variable
    private boolean isSoundPlaying;

    //Constructor
    public Laptop(String manufacturedYear, int screenWidth, int screenHeight) {
        super(manufacturedYear, screenWidth, screenHeight);
        this.isSoundPlaying = false;
    }

    //Method

    public void playMusic() {
        this.isSoundPlaying = true;
    }

}
