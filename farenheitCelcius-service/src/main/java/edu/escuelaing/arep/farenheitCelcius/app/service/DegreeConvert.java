package edu.escuelaing.arep.farenheitCelcius.app.service;

import org.json.JSONObject;

public class DegreeConvert {
    private Double tempDegree;

    public Double farenheitToCelsius(Double f) {
        tempDegree = f;
        double c = (f - 32) * (5.0/9);
        return c;
    }

    public JSONObject defaultOut(Double res){
        String temp = "{ Celcius:" + res + ",Fanrenheit:" +  tempDegree +"}";
        JSONObject jsonObject = new JSONObject(temp);
        return jsonObject;
    }
}
