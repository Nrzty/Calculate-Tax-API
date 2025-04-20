package br.com.Nrzty.calculator_tax_Api.model;

public enum CategoryEnum {
    ELECTRONICS,
    FOOD,
    CLOTHING;

    public double getTaxByCategory(double price){
        switch (this){
            case ELECTRONICS:
                return price * 0.15;
            case FOOD:
                return price * 0.05;
            case CLOTHING:
                return price * 0.10;
            default:
                throw new IllegalArgumentException("Invalid Category" + this);
        }
    }
}
