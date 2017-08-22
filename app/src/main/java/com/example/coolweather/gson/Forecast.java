package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ab131 on 2017/8/22.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temerature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String max;
        public String min;

    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
