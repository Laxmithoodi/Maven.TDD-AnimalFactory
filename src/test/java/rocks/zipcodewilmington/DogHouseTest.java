package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }


    @Test
    public void addDogTest(){

        //Given

       Date birthDate = new Date();
       Dog adddog1 = new Dog("Dash", birthDate, 2);
        DogHouse.clear();

        //When
        DogHouse.add(adddog1);
        int dogCount = DogHouse.getNumberOfDogs();

        //Then

        Assert.assertEquals( 1, dogCount);

    }

    @Test

    public void removeDogTest(){

        //Given
        Date birthDate = new Date();
        Dog adddog1 = new Dog("Dash", birthDate, 2);
        DogHouse.clear();
        DogHouse.add(adddog1);
        int expdogCount = DogHouse.getNumberOfDogs();
        //When
      //  int dogCount = DogHouse.getNumberOfDogs();


        DogHouse.remove(adddog1);
        expdogCount = expdogCount-1;
        int actualdogCount = DogHouse.getNumberOfDogs();

        //Then

        Assert.assertEquals(expdogCount, actualdogCount);
    }


    @Test

    public void removeIntegerIdTest(){
        //Given
        Date birthDate = new Date();
        Dog adddog1 = new Dog("Dash", birthDate, 2);

        DogHouse.remove(2);
        Dog  actualdog = DogHouse.getDogById(2);
        DogHouse.clear();
    //Then
        Assert.assertNull(actualdog);


    }

    @Test
    public void getDogByIdTest(){
         //Given
        Date birthDate = new Date();
        Dog adddog1 = new Dog("Dash", birthDate, 2);
        DogHouse.clear();
        DogHouse.add(adddog1);
    //When

        Dog  actualdog = DogHouse.getDogById(2);

        //Then
        Assert.assertNotNull(actualdog);



    }

    @Test

    public void getNumberofDogstest(){

        Date birthDate = new Date();
        Dog adddog1 = new Dog("Dash", birthDate, 2);
        DogHouse.clear();

        DogHouse.add(adddog1);
        DogHouse.add(adddog1);
        Integer expectedDogCount = 2;
        //When
        Integer actualDog = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expectedDogCount, actualDog);

    }



}
