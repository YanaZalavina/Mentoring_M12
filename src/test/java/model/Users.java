package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Users {
    private Integer id;
    private String name;
    private String username;
    private String email;
    private Map<String, String> adress;
    private ArrayList<String> keysForAdress = new ArrayList<String>(Arrays.asList("street", "suite", "city", "zipcode", "geo"));
    private ArrayList<String> listOfGeo;
    private String phone;
    private String website;
    //private String company;
    private Map<String, String> company;
    private ArrayList<String> keysForcompany = new ArrayList<String>(Arrays.asList("name", "catchPhrase", "bs"));
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getAdress() {
        return adress;
    }

    public void setAdress(Map<String, String> adress) {
        this.adress = adress;
    }

    public ArrayList<String> getKeysForAdress() {
        return keysForAdress;
    }

    public void setKeysForAdress(ArrayList<String> keysForAdress) {
        this.keysForAdress = keysForAdress;
    }

    public ArrayList<String> getListOfGeo() {
        return listOfGeo;
    }

    public void setListOfGeo(ArrayList<String> listOfGeo) {
        this.listOfGeo = listOfGeo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public Map<String, String> getCompany() {
        return company;
    }

    public void setCompany(Map<String, String> company) {
        this.company = company;
    }

    public ArrayList<String> getKeysForcompany() {
        return keysForcompany;
    }

    public void setKeysForcompany(ArrayList<String> keysForcompany) {
        this.keysForcompany = keysForcompany;
    }

    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
