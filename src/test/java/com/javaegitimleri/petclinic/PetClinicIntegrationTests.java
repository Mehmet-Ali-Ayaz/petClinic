package com.javaegitimleri.petclinic;

import java.util.List;

import com.javaegitimleri.pet.model.Owner;
import com.javaegitimleri.pet.model.Vet;
import com.javaegitimleri.pet.service.PetClinicService;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest(properties={"spring.profiles.active=dev"})
public class PetClinicIntegrationTests {
    @Autowired
    private PetClinicService petClinicService;

    @Test
    public void testFindOwners() {
        List<Owner> owners = petClinicService.findOwners();
        MatcherAssert.assertThat(owners.size(), Matchers.equalTo(10));
    }

    @Test
    public void testFindVets() {
        List<Vet> vets = petClinicService.findVets();
        MatcherAssert.assertThat(vets.size(), Matchers.equalTo(3));
    }
}