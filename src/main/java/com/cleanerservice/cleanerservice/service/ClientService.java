package com.cleanerservice.cleanerservice.service;

import com.cleanerservice.cleanerservice.model.Client;
import com.cleanerservice.cleanerservice.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
@AllArgsConstructor

public class ClientService {


    private final com.cleanerservice.cleanerservice.repository.ClientRepository clientRepository;
    private ClientRepository ClientRepository;

    public Client createClient(Client client){
        return clientRepository.save(client);
    }

    public List<Client> listAllClient() {
        return clientRepository.findAll();
    }

    public ResponseEntity<Client> findClientkById(Long id){
        return  clientRepository.findById(id)
                .map(client -> ResponseEntity.ok().body(client))
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Client> updateClientById(Client client, Long id){
        return clientRepository.findById(id)
                .map(clientToUpdate ->{
                    clientToUpdate.setName(client.getName());
                    clientToUpdate.setCpf(client.getCpf());
                    Client updated = clientRepository.save(clientToUpdate);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Object> deleteById (Long id){
        return clientRepository.findById(id)
                .map(taskToDelete ->{
                    clientRepository.deleteById(id);
                    return ResponseEntity.noContent().build();
                }).orElse(ResponseEntity.notFound().build());

    }
}
