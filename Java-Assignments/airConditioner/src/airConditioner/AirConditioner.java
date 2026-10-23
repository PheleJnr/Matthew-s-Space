package airConditioner;

public class AirConditioner {

    private boolean airConditionerState;
    private int temperature;
    public boolean isOn() {
        return airConditionerState;
    }

    public void turnOn() {
        airConditionerState = true;
        temperature  = 16;

    }

    public void turnOff() {
        airConditionerState = false;
    }

    public int checkTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(temperature<30)
            temperature +=1;
    }

    public void decrease() {
        if (temperature >16)
            temperature -=1;
    }
}
