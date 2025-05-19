package org.example.mohamedamineghazoui.mappers;

import org.example.mohamedamineghazoui.dtos.ClientDTO;
import org.example.mohamedamineghazoui.dtos.CreditImmobilierDTO;
import org.example.mohamedamineghazoui.dtos.CreditPersonnelDTO;
import org.example.mohamedamineghazoui.dtos.CreditProfessionnelDTO;
import org.example.mohamedamineghazoui.entities.Client;
import org.example.mohamedamineghazoui.entities.CreditImmobilier;
import org.example.mohamedamineghazoui.entities.CreditPersonnel;
import org.example.mohamedamineghazoui.entities.CreditProfessionnel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class CreditAccountMapperImpl {

    // ***************************************************************************************

    public ClientDTO fromClient(Client client) {
        ClientDTO clientDTO = new ClientDTO();
        BeanUtils.copyProperties(client, clientDTO);
        return clientDTO;
    }

    public Client fromClientDTO(ClientDTO clientDTO) {
        Client client = new Client();
        BeanUtils.copyProperties(clientDTO, client);
        return client;
    }

    // ***************************************************************************************

    public CreditImmobilierDTO fromCreditImmobilier(CreditImmobilier creditImmobilier) {
        CreditImmobilierDTO creditImmobilierDTO = new CreditImmobilierDTO();
        BeanUtils.copyProperties(creditImmobilier, creditImmobilierDTO);
        return creditImmobilierDTO;
    }

    public CreditImmobilier fromCreditImmobilierDTO(CreditImmobilierDTO creditImmobilierDTO) {
        CreditImmobilier creditImmobilier = new CreditImmobilier();
        BeanUtils.copyProperties(creditImmobilierDTO, creditImmobilier);
        return creditImmobilier;
    }

    // ***************************************************************************************
    public CreditPersonnelDTO fromCreditPersonnel(CreditPersonnel creditPersonnel) {
        CreditPersonnelDTO creditPersonnelDTO = new CreditPersonnelDTO();
        BeanUtils.copyProperties(creditPersonnel, creditPersonnelDTO);
        return creditPersonnelDTO;
    }

    public CreditPersonnel fromCreditPersonnelDTO(CreditPersonnelDTO creditPersonnelDTO) {
        CreditPersonnel creditPersonnel = new CreditPersonnel();
        BeanUtils.copyProperties(creditPersonnelDTO, creditPersonnel);
        return creditPersonnel;
    }

    // ***************************************************************************************

    public CreditProfessionnelDTO fromCreditPersonnel(CreditProfessionnel creditProfessionnel) {
        CreditProfessionnelDTO creditProfessionnelDTO = new CreditProfessionnelDTO();
        BeanUtils.copyProperties(creditProfessionnel, creditProfessionnelDTO);
        return creditProfessionnelDTO;
    }

    public CreditProfessionnel fromCreditProfessionnelDTO(CreditProfessionnelDTO creditProfessionnelDTO) {
        CreditProfessionnel creditProfessionnel = new CreditProfessionnel();
        BeanUtils.copyProperties(creditProfessionnelDTO, creditProfessionnel);
        return creditProfessionnel;
    }
}
