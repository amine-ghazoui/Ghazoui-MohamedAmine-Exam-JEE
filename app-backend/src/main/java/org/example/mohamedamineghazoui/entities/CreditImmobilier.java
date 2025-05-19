package org.example.mohamedamineghazoui.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.mohamedamineghazoui.enums.TypeBien;

@Entity
@Data
@DiscriminatorValue("IMMOBILIER")
@AllArgsConstructor @NoArgsConstructor
public class CreditImmobilier extends Credit{

    private TypeBien typeBien;
}
