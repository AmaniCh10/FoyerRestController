package com.example.foyer_amani_chamakh.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idbloc;
    private String nombloc;
    private Long capaciteBloc;

    @ManyToOne
    Foyer f;
    @OneToMany(mappedBy = "chambre")
    List<Chambre> listChambre=new ArrayList<>();




}
