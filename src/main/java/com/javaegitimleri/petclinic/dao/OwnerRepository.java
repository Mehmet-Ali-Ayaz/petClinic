package com.javaegitimleri.petclinic.dao;

import java.util.List;

import com.javaegitimleri.pet.model.Owner;

public interface OwnerRepository {
	
	List<Owner>findAll();
	Owner findById(Long id);
	List<Owner>findByLastName(String Lastname);
	void create(Owner owner);
	Owner update(Owner owner);
	void delete(Long id);

}
