package org.example.mohamedamineghazoui.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.mohamedamineghazoui.entities.Client;
import org.example.mohamedamineghazoui.entities.Remboursement;
import org.example.mohamedamineghazoui.enums.StatutCredit;

import java.util.Date;
import java.util.List;

@Data
public class CreditDTO {

    private String type;
}
