package com.ohgiraffers.hw3.model.vo;

public class ProductDTO {
    private int pId;
    private String pName;
    private int price;
    private double tax;

    public ProductDTO() {
    }

    public ProductDTO(int pId, String pName, int price, double tax) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }
    public String information() {
        StringBuilder sb = new StringBuilder();
        sb.append(pId);
        sb.append(" | ");
        sb.append(pName);
        sb.append(" | ");
        sb.append(price);
        sb.append(" | ");
        sb.append(tax + "\n");
        return sb.toString();
    }
}
