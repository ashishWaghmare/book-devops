package org.springframework.samples.petclinic.customers.web;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.samples.petclinic.customers.model.Owner;
import org.springframework.samples.petclinic.customers.model.OwnerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/owners")
public class OwnerResource {
	private final OwnerRepository ownerRepository = null;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Owner createOwner(@Valid @RequestBody Owner owner) {
		return ownerRepository.save(owner);
	}

	public Optional<Owner> findOwner(@PathVariable("ownerId") int ownerId) {
		return ownerRepository.findById(ownerId);
	}

	@GetMapping
	public List<Owner> findAll() {
		return ownerRepository.findAll();
	}

}
