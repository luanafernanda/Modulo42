package com.example.luana.cliente.controller;

import com.example.luana.cliente.model.Cliente;
import com.example.luana.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
        return clienteService.cadastrarCliente(cliente);
    }

    @PutMapping("/{id}")
    public Cliente alterarCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        return clienteService.alterarCliente(id, cliente);
    }

    @GetMapping("/{id}")
    public Cliente pesquisarCliente(@PathVariable Long id) {
        return clienteService.pesquisarCliente(id);
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }
}
