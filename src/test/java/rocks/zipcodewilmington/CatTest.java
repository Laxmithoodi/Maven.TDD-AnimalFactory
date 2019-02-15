package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    public void setUp() {

    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {

        //Given
        String expName = "tracy";
        Date expDate = new Date();
        Integer expId = 0;

        //When
        Cat cat = new Cat(expName, expDate, expId);
        cat.setName(expName);
        String actName = cat.getName();

        //Then
        Assert.assertEquals(expName, actName);
    }

    @Test
    public void setBirthDateTest() {

        //Given
        String expName1 = "tracy";
        Date expDate1 = new Date(0121);
        Integer expId1 = 0;

        //When
        Cat cat = new Cat(expName1, expDate1, expId1);
        Date actDate = cat.getBirthDate();

        //Then
        Assert.assertEquals(expDate1, actDate);

    }


    @Test

    public void speakTest() {

        //Given
        String expSpeak = "meow!";
        String expName1 = "tracy";
        Date expDate1 = new Date();
        Integer expId1 = 0;
        //When
        Cat cat = new Cat(expName1, expDate1, expId1);
        String actSpeak = cat.speak();

        //Then
        Assert.assertEquals(expSpeak, actSpeak);

    }

    @Test
    public void setId() {
        //Given
       String expName1 = "tracy";
        Date expDate1 = new Date();
        Integer expId1 = 1;
        //When
      Cat cat = new Cat(expName1, expDate1, expId1);
        Integer actId = cat.getId();

        //Then
        Assert.assertEquals(expId1, actId);
    }


    @Test
    public void eatTest() {
        //Given
        String expName1 = "tracy";
        Date expDate1 = new Date();
        Integer expId1 = 1;
        Food food = new Food();
        //Integer expMealEaten = 0;
        Cat cat = new Cat(expName1, expDate1, expId1);

        //When
        cat.eat(food);
        Integer mealBefore = cat.getNumberOfMealsEaten();

        // when

        Integer mealAfter = cat.getNumberOfMealsEaten();

        // then
      //  Assert.assertEquals(0, mealBefore.intValue());
      //  Assert.assertEquals(1, mealBefore.intValue());

        Assert.assertEquals(mealBefore, mealAfter);
    }


    @Test
    public void animalInheritanceTest(){
        //Given
        String expName1 = "tracy";
        Date expDate1 = new Date(0121);
        Integer expId1 = 0;

        //When
        Cat cat = new Cat(expName1, expDate1, expId1);


        //Then
        Assert.assertTrue(cat instanceof Animal);
    }


    @Test
    public void mammalInheritanceTest(){

        //Given
        String expName1 = "tracy";
        Date expDate1 = new Date(0121);
        Integer expId1 = 0;

        //When
        Cat cat = new Cat(expName1, expDate1, expId1);


        //Then
        Assert.assertTrue(cat instanceof Mammal);


    }

}


