package com.example.foyer_amani_chamakh.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder //generation des constructures
    @Table
    public class Reservation  {
        @Id
        @GeneratedValue()
        private String idReservation;
        private Date anneeUniversitaire;
        private Boolean estValide;
        /*@ManyToMany(mappedBy = "reserv")
        List<Etudi> etudiant=new ArrayList<>();*/


    }

