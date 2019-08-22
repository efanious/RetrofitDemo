package efana.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

/*
https://codebeautify.org/json-to-java-converter#
For converting from JSON to Java Objects
 */

public class User {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("username")
    private String username;
    @SerializedName("email")
    private String email;
    @SerializedName("address")
    Address AddressObject;
    @SerializedName("phone")
    private String phone;
    @SerializedName("website")
    private String website;
    @SerializedName("company")
    Company CompanyObject;

    public User(Integer id, String name, String username, String email,
                Address addressObject, String phone, String website,
                Company companyObject) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        AddressObject = addressObject;
        this.phone = phone;
        this.website = website;
        CompanyObject = companyObject;
    }

    // Getter Methods
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return AddressObject;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public Company getCompany() {
        return CompanyObject;
    }

    // Setter Methods
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address addressObject) {
        this.AddressObject = addressObject;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setCompany(Company companyObject) {
        this.CompanyObject = companyObject;
    }
}
