package br.com.Nrzty.calculator_tax_Api.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ReceivedData {

    @NotBlank(message = "Product name is required!")
    private String productName;

    @NotNull(message = "Price is required!")
    private double price;

    @NotNull(message = "Category is required!")
    private CategoryEnum category;

    public ReceivedData(){

    }

    ReceivedData(String productName, double price, CategoryEnum category){
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }
}
