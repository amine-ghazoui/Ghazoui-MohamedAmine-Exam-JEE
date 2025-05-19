package org.example.mohamedamineghazoui.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.mohamedamineghazoui.entities.Credit;
import org.example.mohamedamineghazoui.enums.TypeRemboursement;

import java.util.Date;

@Data
public class RemboursementDTO {

    private Long id;
    private Date date;
    private Double montant;
    private TypeRemboursement type;
    private Credit credit;
}
