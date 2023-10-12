package com.example.kakao.sample;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SampleDataRepository extends JpaRepository<SampleData, Integer> {
}
