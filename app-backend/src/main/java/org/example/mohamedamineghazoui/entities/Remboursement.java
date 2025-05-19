package org.example.mohamedamineghazoui.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.mohamedamineghazoui.enums.TypeRemboursement;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Remboursement {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Double montant;
    private TypeRemboursement type;

    @ManyToOne
    private Credit credit;
}
