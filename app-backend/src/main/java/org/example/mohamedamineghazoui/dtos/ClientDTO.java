package org.example.mohamedamineghazoui.dtos;

import jakarta.persistence.*;
import lombok.*;
import org.example.mohamedamineghazoui.entities.Credit;

import java.util.List;


@Data
@Getter @Setter
public class ClientDTO {

    private Long id;
    private String nom;
    private String email;
}

