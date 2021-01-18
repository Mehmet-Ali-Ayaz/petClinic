package com.javaegitimleri.pet.dao;

import java.util.List;

import com.javaegitimleri.pet.model.Pet;


public interface PetRepository {
	
	Pet findById(long id);
	List<Pet>findByOwnerId(Long ownerId);
	void create (Pet pet);
	Pet update(Pet pet);
	void delete(Long id);
	void deleteByOwnerId(Long ownerId);

}
