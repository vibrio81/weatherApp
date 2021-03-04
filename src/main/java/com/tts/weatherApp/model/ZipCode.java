package com.tts.weatherApp.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class ZipCode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


   public Long id;
   public String zipCode;

}
