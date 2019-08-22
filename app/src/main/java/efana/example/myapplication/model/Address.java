package efana.example.myapplication.model;


import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("street")
    private String street;
    @SerializedName("suite")
    private String suite;
    @SerializedName("city")
    private String city;
    @SerializedName("zipcode")
    private String zipcode;
    @SerializedName("geo")
    Geo GeoObject;


    // Getter Methods
    public String getStreet() {
        return street;
    }

    public String getSuite() {
        return suite;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public Geo getGeo() {
        return GeoObject;
    }

    // Setter Methods
    public void setStreet(String street) {
        this.street = street;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setGeo(Geo geoObject) {
        this.GeoObject = geoObject;
    }
}
