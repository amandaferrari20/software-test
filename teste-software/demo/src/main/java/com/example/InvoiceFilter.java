package com.example;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class InvoiceFilter {
  // Atributo da classe que vai conter a dependência
  private final IssuedInvoices issuedInvoices;

  // As faturas agora sãp passadas via construtor
  public InvoiceFilter(IssuedInvoices issuedInvoices) {
    this.issuedInvoices = issuedInvoices;
  }
  public List<Invoice> lowValueInvoices() {
    // Recuperação as faturas sem acesso ao BD, elas vêm pela 
    // dependência
    List<Invoice> all = issuedInvoices.all();
    return all.stream()
        .filter(invoice -> invoice.getValue() < 100)
        .collect(toList());
  }
} 