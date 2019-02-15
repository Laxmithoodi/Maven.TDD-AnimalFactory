package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.sql.SQLOutput;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test

    public void setNewDog() {

        //Given
        String expName = "dash";
        Date expBirthDate = new Date();
        Integer expId = 1;

        //When

        Dog dog = new Dog(expName, expBirthDate, expId);

        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();
        Integer actualId = dog.getId();

        //Then

        Assert.assertEquals(expName, actualName);

    }

    @Test
    public void setSpeak() {

        //Given
        String expSpeak = "bark!";
        String expName1 = "dash";
        Date expBirthDate1 = new Date();
        Integer expId1 = 1;

        //When

        Dog dog = new Dog(expName1, expBirthDate1, expId1);
          String actualSpeak = dog.speak();
        //Then

        Assert.assertEquals(expSpeak, actualSpeak);


    }

    @Test

    public void setBirthDateTest(){

    //Given
        String expName1 = "dash";
        Date expBirthDate1 = new Date();
        Integer expId1 = 1;
     //When
      Dog dog = new Dog(expName1, expBirthDate1, expId1);
      Date actualBirthDate1 = dog.getBirthDate();
      //Then

        Assert.assertEquals(expBirthDate1, actualBirthDate1);
      
    }

    @Test

    public void eatTest(){
     //Given
        String expName1 = "dash";
        Date expBirthDate1 = new Date();
        Integer expId1 = 1;
       Food food = new Food();

     //When
      Dog dog = new Dog(expName1, expBirthDate1, expId1);

      dog.eat(food);
           Integer eatBefore =   dog.getNumberOfMealsEaten();

        System.out.println(eatBefore);
           Integer eatAfter = dog.getNumberOfMealsEaten();
        System.out.println(eatAfter);


      //Then
            Assert.assertEquals(eatBefore, eatAfter);

    }

    @Test

    public void setId() {
        //Given
        String expName1 = "dash";
        Date expBirthDate1 = new Date();
        Integer expId1 = 1;
        //When
        Dog dog = new Dog(expName1, expBirthDate1, expId1);
        Integer actualId1 = dog.getId();
        //Then

        Assert.assertEquals(expId1, actualId1);
    }


     @Test
    public void animalDogInheritanceTest() {

         //Given
         String expName = "dash";
         Date expBirthDate = new Date();
         Integer expId = 1;
         //When
         Dog dog = new Dog(expName, expBirthDate, expId);

         //Then

         Assert.assertTrue(dog instanceof Animal);
     }


     @Test

       public void mammalDogInheritanceTest(){
        //Given

         String expName =  "dash" ;
         Date expBirthDate = new Date();
         Integer expId =1;

         //When

         Dog dog = new Dog(expName, expBirthDate, expId);
         //Then

         Assert.assertTrue(dog instanceof Mammal);


     }


          

    }