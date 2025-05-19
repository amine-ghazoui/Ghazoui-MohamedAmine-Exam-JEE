package org.example.mohamedamineghazoui.web;

import lombok.AllArgsConstructor;
import org.example.mohamedamineghazoui.dtos.ClientDTO;
import org.example.mohamedamineghazoui.services.CreditService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClientRestController {

    private CreditService creditService;

    @GetMapping("/clients")
    public List<ClientDTO> clients(){
        return creditService.getAllClients();
    }

    @GetMapping("/clients/{id}")
    public ClientDTO getClient(@PathVariable(name = "id") Long clientId){
        return creditService.getClientById(clientId);
    }

    @PostMapping("/clients")
    public ClientDTO saveClient(@RequestBody ClientDTO customerDTO) {
        return creditService.createClient(customerDTO);
    }

    @DeleteMapping("/clients/{id}")
    public void deleteClient(@PathVariable Long id){
        creditService.deleteClient(id);
    }

}
