package br.com.Nrzty.calculator_tax_Api.model;

public class ResponseData {

    private String productName;
    private CategoryEnum category;

    private double price;
    private double totalPrice;

    private double taxAmount;

    public ResponseData(){

    }

    ResponseData(String productName, CategoryEnum category, double price, double totalPrice, double taxAmount){
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.totalPrice = totalPrice;
        this.taxAmount = taxAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double tax) {
        this.taxAmount = tax;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double total) {
        this.totalPrice = total;
    }
}
