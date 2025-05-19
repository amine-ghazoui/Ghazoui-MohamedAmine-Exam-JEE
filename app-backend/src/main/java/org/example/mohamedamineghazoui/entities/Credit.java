package org.example.mohamedamineghazoui.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.mohamedamineghazoui.enums.StatutCredit;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CREDIT", discriminatorType = DiscriminatorType.STRING)
@AllArgsConstructor @NoArgsConstructor
public class Credit {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dateDemande;
    private StatutCredit statut;
    @Temporal(TemporalType.DATE)
    private Date dateAcceptation;
    private double montant;
    private int dureeMois; // en mois
    private double tauxInteret;

    @ManyToOne
    private Client client;// en pourcentage

    @OneToMany(mappedBy = "credit", fetch = FetchType.LAZY)
    private List<Remboursement> remboursements;
}
