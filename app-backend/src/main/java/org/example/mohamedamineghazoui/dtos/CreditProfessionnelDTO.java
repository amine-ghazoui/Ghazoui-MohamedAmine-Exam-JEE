package org.example.mohamedamineghazoui.dtos;

import lombok.Data;
import org.example.mohamedamineghazoui.entities.Client;
import org.example.mohamedamineghazoui.entities.Credit;
import org.example.mohamedamineghazoui.enums.StatutCredit;

import java.util.Date;

@Data
public class CreditProfessionnelDTO extends Credit {

    private String motif;
    private String raisonSociale;
    private Date dateDemande;
    private StatutCredit statut;
    private Date dateAcceptation;
    private double montant;
    private int dureeMois; // en mois
    private double tauxInteret;
}
