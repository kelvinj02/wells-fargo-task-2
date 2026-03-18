package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne
    private Advisor advisorId;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private int phone;

    @Column(nullable = false)
    private  String email;

    protected Client() {

    }

    public Client(String firstname, String lastname, String address, int phone, String email)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.address=address;
        this.phone=phone;
        this.email=email;
    }

    public long getClientId() {
        return clientId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
