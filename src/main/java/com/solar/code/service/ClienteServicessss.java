package com.solar.code.service;

import com.solar.code.model.Cliente;

import java.util.List;

public interface ClienteServicessss {
    public List<Cliente> findAll();
    public Cliente findById(Long id);
    public Cliente save(Cliente cliente);
    public void delete(Long id);
}
