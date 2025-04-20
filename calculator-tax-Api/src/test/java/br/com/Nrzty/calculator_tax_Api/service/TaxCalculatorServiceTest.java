package br.com.Nrzty.calculator_tax_Api.service;

import br.com.Nrzty.calculator_tax_Api.model.CategoryEnum;
import br.com.Nrzty.calculator_tax_Api.model.ReceivedData;
import br.com.Nrzty.calculator_tax_Api.model.ResponseData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorServiceTest {

    @Test
    public void testCalculateTaxForEletronics(){
        ReceivedData data = new ReceivedData();

        data.setProductName("SmartPhone");
        data.setCategory(CategoryEnum.ELECTRONICS);
        data.setPrice(1000.00);

        TaxCalculatorService service = new TaxCalculatorService();

        ResponseData result = service.calculateTax(data);

        assertEquals("SmartPhone", result.getProductName());
        assertEquals(1000.00, result.getPrice());
        assertEquals(CategoryEnum.ELECTRONICS, result.getCategory());
        assertEquals(150.00, result.getTaxAmount(), 0.001);
        assertEquals(1150.00, result.getTotalPrice(), 0.001);
    }

    @Test
    public void testCalculateTaxForFood(){
        ReceivedData data = new ReceivedData();

        data.setProductName("Marshmallow");
        data.setCategory(CategoryEnum.FOOD);
        data.setPrice(50.00);

        TaxCalculatorService service = new TaxCalculatorService();

        ResponseData result = service.calculateTax(data);

        assertEquals("Marshmallow", result.getProductName());
        assertEquals(2.5, result.getTaxAmount());
        assertEquals(52.5, result.getTotalPrice());
    }

    @Test
    public void testCalculateTaxForCLOTHING(){
        ReceivedData data = new ReceivedData();

        data.setProductName("T-Shirt");
        data.setCategory(CategoryEnum.CLOTHING);
        data.setPrice(80.00);

        TaxCalculatorService service = new TaxCalculatorService();

        ResponseData result = service.calculateTax(data);

        assertEquals("T-Shirt", result.getProductName());
        assertEquals(8.0, result.getTaxAmount());
        assertEquals(88.0, result.getTotalPrice());
    }
}
