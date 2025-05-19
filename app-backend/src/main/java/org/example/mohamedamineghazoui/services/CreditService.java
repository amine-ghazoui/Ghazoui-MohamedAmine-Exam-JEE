package org.example.mohamedamineghazoui.services;

import org.example.mohamedamineghazoui.dtos.ClientDTO;
import org.example.mohamedamineghazoui.dtos.CreditDTO;
import org.example.mohamedamineghazoui.dtos.RemboursementDTO;
import org.example.mohamedamineghazoui.enums.StatutCredit;
import org.example.mohamedamineghazoui.enums.TypeBien;

import java.util.List;

public interface CreditService {


    ClientDTO createClient(ClientDTO clientDTO);
    ClientDTO updateClient(Long id, ClientDTO clientDTO);
    ClientDTO getClientById(Long id);
    List<ClientDTO> getAllClients();
    List<ClientDTO> searchClients(String keyword);
    void deleteClient(Long id);


    CreditDTO demanderCredit(CreditDTO creditDTO);
    List<CreditDTO> consulterCreditsClient(Long clientId);
    CreditDTO consulterCredit(Long creditId);
    void changerStatutCredit(Long creditId, StatutCredit nouveauStatut);
    List<CreditDTO> listerCreditsParStatut(StatutCredit statut);



    RemboursementDTO ajouterRemboursement(Long creditId, RemboursementDTO remboursementDTO);
    List<RemboursementDTO> consulterRemboursementsCredit(Long creditId);
    double calculerMontantRestant(Long creditId);


    List<CreditDTO> rechercherCreditsPersonnelsParMotif(String motif);
    List<CreditDTO> rechercherCreditsImmoParTypeBien(TypeBien typeBien);
    List<CreditDTO> rechercherCreditsProParRaisonSociale(String raisonSociale);
}
