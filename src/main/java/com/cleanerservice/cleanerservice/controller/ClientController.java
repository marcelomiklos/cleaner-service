package com.cleanerservice.cleanerservice.controller;


import com.cleanerservice.cleanerservice.model.Client;
import com.cleanerservice.cleanerservice.repository.ClientRepository;
import com.cleanerservice.cleanerservice.service.ClientService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
@Slf4j

public class ClientController {

    ClientService clientService;
    private ClientRepository ClientRepository;

    @PostMapping("/client")
    @ResponseStatus(HttpStatus.CREATED)

    public Client createClient(@RequestBody Client client) {
        log.info("Creating client: {}", client);
        return clientService.createClient(client);
    }

    @GetMapping("/client")
    @ResponseStatus(HttpStatus.OK)
    public List<Client> getAllClient() {
        log.info("Listing all Client: {}");
        return clientService.listAllClient();
    }

    @GetMapping("/client/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Client> getClientById(@PathVariable (value = "id") Long id) {
        log.info("Listing Client with id: {}", id);
        return clientService.findClientkById(id);
    }

    @PutMapping("/client/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Client> updateClientById(@PathVariable (value = "id") Long id, @RequestBody Client client) {
        log.info("updating Client with id: {} and the new information is: {}", id, client);
        return clientService.updateClientById(client,id);
    }

    @DeleteMapping("/client/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> deleteClientById(@PathVariable (value = "id") Long id) {
        log.info("Deleted client {} and with id: {}", id);
        return clientService.deleteById(id);
    }

}

