package br.com.Nrzty.calculator_tax_Api.service;

import br.com.Nrzty.calculator_tax_Api.model.CategoryEnum;
import br.com.Nrzty.calculator_tax_Api.model.ReceivedData;
import br.com.Nrzty.calculator_tax_Api.model.ResponseData;
import org.springframework.stereotype.Service;

@Service
public class TaxCalculatorService {

    public ResponseData calculateTax(ReceivedData data){
        if (data.getPrice() <= 0){
            throw new IllegalArgumentException("The product price must be greater than zero.");
        }

        double price = data.getPrice();
        CategoryEnum category = data.getCategory();

        double tax = category.getTaxByCategory(price);
        double total = price + tax;

        ResponseData response = new ResponseData();
        response.setProductName(data.getProductName());
        response.setPrice(price);
        response.setCategory(category);
        response.setTaxAmount(tax);
        response.setTotalPrice(total);

        return response;
    }
}
