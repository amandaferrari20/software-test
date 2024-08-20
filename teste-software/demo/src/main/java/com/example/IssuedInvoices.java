package com.example;

import java.util.ArrayList;
import java.util.List;

public class IssuedInvoices {
    private final List<Invoice> invoices;

    // Construtor para inicializar a lista de faturas
    public IssuedInvoices() {
        this.invoices = new ArrayList<>();
    }

    // Adiciona uma fatura à lista
    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    // Recupera todas as faturas
    public List<Invoice> all() {
        return new ArrayList<>(invoices);
    }
}