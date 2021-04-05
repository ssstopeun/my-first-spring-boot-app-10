package cnu.realcoding.Service;

import cnu.realcoding.Domain.Dog;
import cnu.realcoding.exception.DogNogFoundException;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogManagementService {
    @Getter
    private static List<Dog> dogs = new ArrayList<>();

    public static void insertDog(Dog dog){
        dogs.add(dog);
    }

    public Dog getDogByName(String name){
        for (Dog dog : dogs) {
            if (dog.getName().equals(name)) {
                return dog;
            }
        }
        throw new DogNogFoundException();
    }
}
