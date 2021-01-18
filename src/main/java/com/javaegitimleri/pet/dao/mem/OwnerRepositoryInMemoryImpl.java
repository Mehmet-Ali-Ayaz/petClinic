package com.javaegitimleri.pet.dao.mem;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.javaegitimleri.pet.dao.OwnerRepository;
import org.springframework.stereotype.Repository;

import com.javaegitimleri.pet.model.Owner;

@Repository
public class OwnerRepositoryInMemoryImpl implements OwnerRepository {
	
	private Map<Long,Owner> OwnersMap = new HashMap<>();
    
	public OwnerRepositoryInMemoryImpl() {
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Kenan");
		owner1.setLastName("Sevindik");
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Ali");
		owner2.setLastName("Ayaz");
		
		Owner owner3 = new Owner();
		owner3.setId(3L);
		owner3.setFirstName("Muharrem");
		owner3.setLastName("Yucel");
		
		Owner owner4 = new Owner();
		owner4.setId(4L);
		owner4.setFirstName("Yılmaz");
		owner4.setLastName("Erdoğan");
		
		OwnersMap.put(owner1.getId(), owner1);
		OwnersMap.put(owner2.getId(), owner2);
		OwnersMap.put(owner3.getId(), owner3);
		OwnersMap.put(owner4.getId(), owner4);		
	}
	
	@Override
	public List<Owner> findAll() {
		// TODO Auto-generated method stub
		return new ArrayList<>(OwnersMap.values());
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return OwnersMap.get(id);
	}

	@Override
	public List<Owner> findByLastName(String Lastname) {
		// TODO Auto-generated method stub
		return OwnersMap.values().stream().filter(o->o.getLastName().equals(Lastname)).collect(Collectors.toList());
	}

	@Override
	public void create(Owner owner) {
		owner.setId(new Date(0).getTime());
		OwnersMap.put(owner.getId(), owner);
		
	

	}

	@Override
	public Owner update(Owner owner) {
		OwnersMap.replace(owner.getId(), owner);
		return owner;
	}

	@Override
	public void delete(Long id) {
		OwnersMap.remove(id);
		

	}

}
