package pl.javaprogrammer.models.services;


public interface IWeatherObserver {
    void onWeatherUpdate(WeatherInfo weatherInfo);
}
