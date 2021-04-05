package cnu.realcoding.controller;

import cnu.realcoding.Domain.Dog;
import cnu.realcoding.Service.DogManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DogController {

    @Autowired
    private DogManagementService dogManagementService;

    @PostMapping("/dogs")
    public void createDogs(@RequestBody Dog dog){
        DogManagementService.insertDog(dog);
    }
    @GetMapping("/dogs")
    public List<Dog> getAllDogs(){
        return DogManagementService.getDogs();
    }

    // localhost:8010/dogs/ian
    @GetMapping("/dogs/{name}")
    public Dog getDogByName(@PathVariable String name){
        return dogManagementService.getDogByName(name);
    }

}
