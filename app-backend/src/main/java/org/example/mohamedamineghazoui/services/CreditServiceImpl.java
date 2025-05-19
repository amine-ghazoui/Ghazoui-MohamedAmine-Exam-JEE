package org.example.mohamedamineghazoui.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.mohamedamineghazoui.dtos.ClientDTO;
import org.example.mohamedamineghazoui.dtos.CreditDTO;
import org.example.mohamedamineghazoui.dtos.RemboursementDTO;
import org.example.mohamedamineghazoui.entities.Client;
import org.example.mohamedamineghazoui.enums.StatutCredit;
import org.example.mohamedamineghazoui.enums.TypeBien;
import org.example.mohamedamineghazoui.mappers.CreditAccountMapperImpl;
import org.example.mohamedamineghazoui.repositories.ClientRepository;
import org.example.mohamedamineghazoui.repositories.CreditRepository;
import org.example.mohamedamineghazoui.repositories.RemboursementRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class CreditServiceImpl implements CreditService {

    private ClientRepository clientRepository;
    private CreditRepository creditRepository;
    private RemboursementRepository remboursementRepository;
    private CreditAccountMapperImpl mapper;


    @Override
    public ClientDTO createClient(ClientDTO clientDTO) {
        Client client = mapper.fromClientDTO(clientDTO);
        return mapper.fromClient(clientRepository.save(client));
    }

    @Override
    public ClientDTO updateClient(Long id, ClientDTO clientDTO) {
        Client existingClient = clientRepository.findById(id).orElse(null);
        existingClient.setNom(clientDTO.getNom());
        existingClient.setEmail(clientDTO.getEmail());

        return mapper.fromClient(clientRepository.save(existingClient));
    }

    @Override
    public ClientDTO getClientById(Long id) {
        Client client = clientRepository.findById(id).orElse(null);
        return mapper.fromClient(client);
    }

    @Override
    public List<ClientDTO> getAllClients() {
        return clientRepository.findAll().stream()
                .map(mapper::fromClient)
                .collect(Collectors.toList());
    }

    @Override
    public List<ClientDTO> searchClients(String keyword) {
        return List.of();
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public CreditDTO demanderCredit(CreditDTO creditDTO) {
        return null;
    }

    @Override
    public List<CreditDTO> consulterCreditsClient(Long clientId) {
        return List.of();
    }

    @Override
    public CreditDTO consulterCredit(Long creditId) {
        return null;
    }

    @Override
    public void changerStatutCredit(Long creditId, StatutCredit nouveauStatut) {

    }

    @Override
    public List<CreditDTO> listerCreditsParStatut(StatutCredit statut) {
        return List.of();
    }

    @Override
    public RemboursementDTO ajouterRemboursement(Long creditId, RemboursementDTO remboursementDTO) {
        return null;
    }

    @Override
    public List<RemboursementDTO> consulterRemboursementsCredit(Long creditId) {
        return List.of();
    }

    @Override
    public double calculerMontantRestant(Long creditId) {
        return 0;
    }

    @Override
    public List<CreditDTO> rechercherCreditsPersonnelsParMotif(String motif) {
        return List.of();
    }

    @Override
    public List<CreditDTO> rechercherCreditsImmoParTypeBien(TypeBien typeBien) {
        return List.of();
    }

    @Override
    public List<CreditDTO> rechercherCreditsProParRaisonSociale(String raisonSociale) {
        return List.of();
    }
}
