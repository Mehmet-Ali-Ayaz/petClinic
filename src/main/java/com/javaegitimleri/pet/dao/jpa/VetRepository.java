package com.javaegitimleri.pet.dao.jpa;

import com.javaegitimleri.pet.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository<Vet, Long> {
}
