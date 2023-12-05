package com.example.foyer_amani_chamakh.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder //generation des constructures
@Table(name="Etudiant")
public class Etudi {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment
        private Long idEtud;
        private String nomet,prenomEt,ecole;
        private Long cin;
        private LocalDate dateNais;
       /* @ManyToMany(mappedBy = "etudi")
        List<Reservation> res=new ArrayList<>();*/

    }

