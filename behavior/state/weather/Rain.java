package behavior.state.weather;

import behavior.state.sky.Sky;

public class Rain implements Weather{
    @Override
    public void handle(Sky sky) {
        System.out.println("It is raining.");
        sky.setWeather(new Dry());
    }
}
