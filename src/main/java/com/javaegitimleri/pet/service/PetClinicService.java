package com.javaegitimleri.pet.service;





import com.javaegitimleri.pet.exception.OwnerNotFoundException;
import com.javaegitimleri.pet.model.Owner;
import com.javaegitimleri.pet.model.Vet;

import javax.validation.Valid;
import java.util.List;


public interface PetClinicService {
    List<Owner> findOwners();
    List<Owner> findOwners(String lastName);
    Owner findOwner(Long id) throws OwnerNotFoundException;
    void createOwner(@Valid Owner owner);
    void updateOwner(Owner owner);
    void deleteOwner(Long id);
    List<Vet> findVets();
    Vet findVet(Long id) throws VetNotFoundException;

    void update(Owner owner);
}