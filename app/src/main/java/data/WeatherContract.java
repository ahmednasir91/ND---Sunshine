package data;

/**
 * Created by Ahmed.
 */
public class WeatherContract {
    public class WeatherEntry implements BaseEntry {
        static final String COLUMN_DATE = "date";
        static final String COLUMN_MIN_TEMP = "min_temperature";
        static final String COLUMN_MAX_TEMP = "max_temperature";
        static final String COLUMN_LOCATION_ID = "location_id";
    }

    public class LocationEntry implements BaseEntry {
        static final String COLUMN_LATITUDE = "latitude";
        static final String COLUMN_LONGITUDE = "longitude";
        static final String COLUMN_CITY_NAME = "city_name";
    }
}
