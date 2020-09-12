package lt.verbus.verbuspetclinic.services;

import lt.verbus.verbuspetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
