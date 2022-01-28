package exercises.technology.main;

public class Computer extends AbstractEntity {
    // 3 properties, 2 methods, 1 constructor

    //variables (properties)
        private String manufacturedYear;
        private int screenWidth;
        private int screenHeight;

    // constructor

    public Computer(String manufacturedYear, int screenWidth, int screenHeight) {
        this.manufacturedYear = manufacturedYear;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }

    // methods

    public void tellDeveloperJoke () {
        System.out.println("Why do Java developers wear glasses? Because they cannot C#");
    }

    public int simpleMath() {
        return 2+2;
    }


    //Getters and Setters
    public String getManufacturedYear() {
        return manufacturedYear;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }
}
