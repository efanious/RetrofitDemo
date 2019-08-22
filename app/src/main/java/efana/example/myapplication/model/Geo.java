package efana.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Geo {

    @SerializedName("lat")
    private String lat;
    @SerializedName("lng")
    private String lng;


    // Getter Methods
    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    // Setter Methods
    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}

