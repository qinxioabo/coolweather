package com.example.coolweather.gson;

/**
 * Created by ab131 on 2017/8/22.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
