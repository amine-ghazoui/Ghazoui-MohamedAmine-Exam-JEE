package org.example.mohamedamineghazoui.dtos;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.mohamedamineghazoui.entities.Client;
import org.example.mohamedamineghazoui.entities.Credit;
import org.example.mohamedamineghazoui.enums.StatutCredit;

import java.util.Date;

@Data
public class CreditPersonnelDTO extends Credit {

    private String motif;
    private Date dateDemande;
    private StatutCredit statut;
    private Date dateAcceptation;
    private double montant;
    private int dureeMois; // en mois
    private double tauxInteret;
}
