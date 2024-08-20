package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class InvoiceFilterTest {
    @Test
    void filterInvoices() {
      // Criação de um Stub
      IssuedInvoices issuedInvoices = mock(IssuedInvoices.class);
      
      // Criação das faturas
      Invoice mauricio = new Invoice("Mauricio", 20);
      Invoice steve = new Invoice("Steve", 99);
      Invoice frank = new Invoice("Frank", 100);
      List<Invoice> listOfInvoices = Arrays.asList(mauricio, steve, frank);
  
      // Determina os valores a serem retornados pelo stub
      when(issuedInvoices.all()).thenReturn(listOfInvoices);
  
      // Passa o Stub como dependência para o método em teste
      InvoiceFilter filter = new InvoiceFilter(issuedInvoices);
  
      // Assertiva sobre o comportamento esperado
      assertThat(filter.lowValueInvoices())
          .containsExactlyInAnyOrder(mauricio, steve);
    } 
  }



