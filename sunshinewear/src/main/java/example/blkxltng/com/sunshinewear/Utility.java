package example.blkxltng.com.sunshinewear;

/**
 * Created by firej on 8/14/2016.
 */
public class Utility {

    public static int getWeatherIcon (int weatherCode) {

        if (weatherCode >= 200 && weatherCode <= 232) {
            return R.drawable.ic_storm;
        } else if (weatherCode >= 300 && weatherCode <= 321) {
            return R.drawable.ic_light_rain;
        } else if (weatherCode >= 500 && weatherCode <= 531) {
            return R.drawable.ic_rain;
        } else if (weatherCode >= 500 && weatherCode <= 622) {
            return R.drawable.ic_snow;
        } else if (weatherCode == 800) {
            return R.drawable.ic_clear;
        } else if (weatherCode >= 801 && weatherCode <= 804) {
            return R.drawable.ic_cloudy;
        }

        return -1;
    }
}
