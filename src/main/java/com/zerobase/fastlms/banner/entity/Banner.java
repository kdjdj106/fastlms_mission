package com.zerobase.fastlms.banner.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    String imagePath;
    String subject;
    @Column(length = 1000)
    String linkAddress;
    boolean openMethod;
    long sortValue;
    boolean usingYn;

    LocalDateTime regDt;
    LocalDateTime udtDt;

    //ADD
    String filename;
    String urlFilename;
}
