package com.example.prosp.paden.services;

/**
 * Created by prosp on 12/16/2018.
 */

public class DataServices {

    public String image;
    public String name;
    public String email;
    public String phone;
    public String nationalId;
    public String date;



    public DataServices( String name,String image,String email,String phone, String nationalId, String date) {

        this.name = name;
        this.email = email;
        this.phone = phone;
        this.nationalId = nationalId;
        this.date = date;
        this.image = image;
    }

    public DataServices() {

    }




    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getNationalId() {
        return nationalId;
    }

    public String getDate() {
        return date;
    }

    public  String getImage() {
        return image;
    }}



