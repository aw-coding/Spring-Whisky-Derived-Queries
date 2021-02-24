package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long> {

    List<Whisky> findWhiskiesByYear(int year);

    //List<Whisky> findByDistillery(Long distilleryId);

    List<Whisky> findWhiskyByDistillery_idAndAge(long distilleryId, int age);
    //List<Whisky> findWhiskyByDistillery_idAndAge(String distilleryName, int age);
}
