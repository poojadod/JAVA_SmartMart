/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author SAMARTH
 */
public class WeatherAPI {

    private static final String API_KEY = 
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather";

    public static Weather getWeatherData(String city) {
        try {
            String urlString = String.format("%s?q=%s&appid=%s&units=metric", BASE_URL, city, API_KEY);
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            return parseWeatherJson(response.toString());
        } catch (Exception e) {
            System.out.println("Error fetching weather: " + e.getMessage());
            return null;
        }
    }

    private static Weather parseWeatherJson(String json) {
        Pattern tempPattern = Pattern.compile("\"temp\":([\\d.]+)");
        Pattern descPattern = Pattern.compile("\"description\":\"([^\"]+)\"");
        Pattern humidityPattern = Pattern.compile("\"humidity\":([\\d]+)");
        Pattern windPattern = Pattern.compile("\"speed\":([\\d.]+)");

        double temp = extractDouble(tempPattern.matcher(json));
        String desc = extractString(descPattern.matcher(json));
        int humidity = (int) extractDouble(humidityPattern.matcher(json));
        double wind = extractDouble(windPattern.matcher(json));

        return new Weather(temp, desc, humidity, wind);
    }

    private static double extractDouble(Matcher matcher) {
        return matcher.find() ? Double.parseDouble(matcher.group(1)) : 0.0;
    }

    private static String extractString(Matcher matcher) {
        return matcher.find() ? matcher.group(1) : "";
    }
}
