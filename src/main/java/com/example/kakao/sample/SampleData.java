package com.example.kakao.sample;

import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor @AllArgsConstructor
@Builder
@Entity
public class SampleData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String detail;
}
