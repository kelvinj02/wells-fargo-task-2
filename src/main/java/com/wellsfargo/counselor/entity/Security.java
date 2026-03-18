package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @OneToOne
    private Portfolio portfolioId;

    @Column
    public String name;

    @Column
    public String category;

    @Column
    public float purchasePrice;

    @Column
    public String purchaseDate;

    @Column
    public int quantity;

    protected Security()
    {

    }

    public Security(String name, String category, float purchasePrice, String purchaseDate, int quantity)
    {
        this.name=name;
        this.category=category;
        this.purchasePrice=purchasePrice;
        this.purchaseDate=purchaseDate;
        this.quantity=quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
