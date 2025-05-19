package org.example.mohamedamineghazoui.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@DiscriminatorValue("PROFESSIONNEL")
@AllArgsConstructor @NoArgsConstructor
public class CreditProfessionnel extends Credit{

    private String motif;
    private String raisonSociale;
}
