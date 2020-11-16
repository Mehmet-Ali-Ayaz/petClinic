package com.javaegitimleri.pet.service;

import java.util.List;

import com.javaegitimleri.pet.exception.OwnerNotFoundException;
import com.javaegitimleri.pet.model.Owner;

public interface PetClinicService {
	List<Owner>findOwners();
	List<Owner>findOwners(String lastName);
	Owner findOwner(Long id) throws OwnerNotFoundException;
    void createOwner(Owner owner);
    void update(Owner owner);
    void deleteOwner(Long id);
}

