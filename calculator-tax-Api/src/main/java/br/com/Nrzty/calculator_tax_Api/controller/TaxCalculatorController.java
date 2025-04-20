package br.com.Nrzty.calculator_tax_Api.controller;

import br.com.Nrzty.calculator_tax_Api.model.ReceivedData;
import br.com.Nrzty.calculator_tax_Api.model.ResponseData;
import br.com.Nrzty.calculator_tax_Api.service.TaxCalculatorService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate")
public class TaxCalculatorController {

    private final TaxCalculatorService taxCalculatorService;

    public TaxCalculatorController(TaxCalculatorService taxCalculatorService) {
        this.taxCalculatorService = taxCalculatorService;
    }

    @PostMapping
    public ResponseEntity<ResponseData> taxCalculate(@Valid @RequestBody ReceivedData data){
        ResponseData response = taxCalculatorService.calculateTax(data);
        return ResponseEntity.ok(response);
    }
}
