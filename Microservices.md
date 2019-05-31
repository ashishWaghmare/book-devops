
Open browser and open URL 
https://start.spring.io/

Make sure you have settings as mentioned below
[![Start Page](image "tooltip")](images/microservice-start.png)

# Lab Machine should hava

## Java 8+
## Spring Tool Suit (STS)

# On your machine

Check if zip is created and present in your download folder.
Unzip and add

# Application Requirements


# Use Cases


# Domain Model 

Look at Class diagram
 
#  Create Domain Model

1. Check class diagram

1. Make package model

1. Owner Class

1. Add all attributes
 
1. Annotate with JPA annotations

1. Create Getters and Setters

1. Create ToString

Note: For now ignore Pets class

# DAO model

create class OwnerRepository by extending


import org.springframework.data.jpa.repository.JpaRepository;
    public interface OwnerRepository extends    JpaRepository<Owner, Integer> { } 


# Create REST service

1. Make package web
1. Create Class

        class OwnerResource {}

1. Inject Repository
 
        class OwnerResource {
            OwnerRepository ownerRepository
        }


1. Now expose above class as REST endpoint

        @RequestMapping("/owners")
        @RestController
        class OwnerResource {
            OwnerRepository ownerRepository
        }


1. create Owner methods

    @RequestMapping("/owners")
    @RestController
        class OwnerResource {
            OwnerRepository ownerRepository

            @PostMapping
            @ResponseStatus(HttpStatus.CREATED)
            public Owner createOwner(@Valid @RequestBody Owner owner) {
                return ownerRepository.save(owner);
            }

        }


1. Add find by id method as below

        @GetMapping(value = "/{ownerId}")
            public Optional<Owner> findOwner(@PathVariable("ownerId") int ownerId) {
                return ownerRepository.findById(ownerId);
            }

# Injecting Dummy Data for Start

We will use command line class to inject Temproary data
# Testing MicroService

Open  below in browser

http://localhost:8080/owners

http://localhost:8080/owners/1

http://localhost:8080/owners/2

