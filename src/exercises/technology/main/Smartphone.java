package exercises.technology.main;

public class Smartphone extends Computer {

    //Class variables
    private boolean isHotspotEnabled;

    //Constructors
    public Smartphone(String manufacturedYear, int screenWidth, int screenHeight) {
        super(manufacturedYear, screenWidth, screenHeight);
        this.isHotspotEnabled = false;
    }

    //Method
    public void turnOnHotspot() {
        this.isHotspotEnabled = true;
        System.out.println("Devices can nbw connected to cellular hotspot.");
    }
}
