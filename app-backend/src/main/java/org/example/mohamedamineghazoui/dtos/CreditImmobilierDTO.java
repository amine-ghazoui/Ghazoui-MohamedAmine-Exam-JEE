package org.example.mohamedamineghazoui.dtos;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.mohamedamineghazoui.entities.Client;
import org.example.mohamedamineghazoui.entities.Credit;
import org.example.mohamedamineghazoui.enums.StatutCredit;
import org.example.mohamedamineghazoui.enums.TypeBien;

import java.util.Date;

@Data
public class CreditImmobilierDTO extends Credit {

    private TypeBien typeBien;
    private Date dateDemande;
    private StatutCredit statut;
    private Date dateAcceptation;
    private double montant;
    private int dureeMois; // en mois
    private double tauxInteret;
    private ClientDTO client;
}
