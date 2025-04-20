package br.com.Nrzty.calculator_tax_Api.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
public class TaxCalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testTaxCalculateEndpoint() throws Exception {
        String json = "{\"productName\": \"Notebook\", \"price\": 2000.0, \"category\": \"ELECTRONICS\"}";

        mockMvc.perform(
                post("/calculate")
                        .content(json)
                        .contentType(APPLICATION_JSON))
                        .andExpect(status().isOk())
                        .andExpect(jsonPath("$.productName").value("Notebook"))
                        .andExpect(jsonPath("$.price").value(2000.0))
                        .andExpect(jsonPath("$.totalPrice").value(2300.0))
                        .andExpect(jsonPath("$.taxAmount").value(300.0));
    }
}
