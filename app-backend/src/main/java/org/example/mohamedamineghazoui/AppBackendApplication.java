package org.example.mohamedamineghazoui;

import org.example.mohamedamineghazoui.entities.Client;
import org.example.mohamedamineghazoui.entities.CreditImmobilier;
import org.example.mohamedamineghazoui.entities.CreditPersonnel;
import org.example.mohamedamineghazoui.entities.Remboursement;
import org.example.mohamedamineghazoui.enums.StatutCredit;
import org.example.mohamedamineghazoui.enums.TypeBien;
import org.example.mohamedamineghazoui.enums.TypeRemboursement;
import org.example.mohamedamineghazoui.repositories.ClientRepository;
import org.example.mohamedamineghazoui.repositories.CreditRepository;
import org.example.mohamedamineghazoui.repositories.RemboursementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class AppBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository clientRepository,
                                        CreditRepository creditRepository,
                                        RemboursementRepository remboursementRepository) {
        return args -> {

            // 1. Création des clients
            Client client1 = new Client();
            client1.setNom("ghazoui");
            client1.setEmail("amine1234@gmail.com");

            Client client2 = new Client();
            client2.setNom("Amine");
            client2.setEmail("mohamed12@gmail.com");

            clientRepository.saveAll(List.of(client1, client2));

            // Crédit Personnel
            CreditPersonnel creditPerso = new CreditPersonnel();
            creditPerso.setMotif("Achat voiture");
            creditPerso.setMontant(15000);
            creditPerso.setMontant(15000);
            creditPerso.setMontant(15000);
            creditPerso.setDureeMois(48);
            creditPerso.setTauxInteret(4.5);
            creditPerso.setDateDemande(new Date());
            creditPerso.setClient(client1);

            // Crédit Immobilier
            CreditImmobilier creditImmo = new CreditImmobilier();
            creditImmo.setTypeBien(TypeBien.APPARTEMENT);
            creditImmo.setMontant(250000);
            creditImmo.setDureeMois(240);
            creditImmo.setTauxInteret(3.2);
            creditImmo.setDateDemande(new Date());
            creditImmo.setStatut(StatutCredit.ACCEPTE);
            creditImmo.setDateAcceptation(new Date());
            creditImmo.setClient(client2);

            creditRepository.saveAll(List.of(creditPerso, creditImmo));

            // Remboursement pour le crédit personnel
            Remboursement remb1 = new Remboursement();
            remb1.setDate(new Date());
            remb1.setMontant(320.50);
            remb1.setType(TypeRemboursement.MENSUALITE);
            remb1.setCredit(creditPerso);

            // Remboursement anticipé pour le crédit immobilier
            Remboursement remb2 = new Remboursement();
            remb2.setDate(new Date());
            remb2.setMontant(5000.0);
            remb2.setType(TypeRemboursement.REMBOURSEMENT_ANTICIPE);
            remb2.setCredit(creditImmo);

            remboursementRepository.saveAll(List.of(remb1, remb2));

        };
    }
}
