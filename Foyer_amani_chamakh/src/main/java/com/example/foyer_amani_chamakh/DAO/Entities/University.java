package com.example.foyer_amani_chamakh.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder //generation des constructures
@Table
    public class University {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment
        private Long idUniversity;
        private String nomUniversity;
        private Long adresse;

        @OneToOne
        Foyer foyer;
    }

