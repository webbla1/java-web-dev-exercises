package exercises.technology.main;

public class Program {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("2017", 2500, 1600);
        myLaptop.playMusic();
        int laptopResult = myLaptop.simpleMath();
        System.out.println("Laptop result is: " + laptopResult);

        Smartphone mySmartphone = new Smartphone("2017", 2500, 1600);
        mySmartphone.tellDeveloperJoke();
        int smartphoneResult = myLaptop.simpleMath();
        System.out.println("Laptop result is: " + smartphoneResult);

    }

}
