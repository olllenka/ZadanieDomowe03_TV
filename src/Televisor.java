public class Televisor {
    boolean turnedOn;

    boolean turnOn(){
        return turnedOn = true;
    }

    boolean turnOff(){
        return turnedOn = false;
    }

    void showStatus(){
        System.out.println("Czy telewizor jest włączony? " + turnedOn);
    }
}
