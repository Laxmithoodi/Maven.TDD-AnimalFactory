package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`



    @Test

    public void animalCreateDogTest(){

        //Given
        String expName = "Dash";
        Date expBirthDate = new Date();

        //When
       Dog createDog1 = AnimalFactory.createDog("Dash", expBirthDate);

       String actualName = createDog1.getName();
       Date  actualBirthDate = createDog1.getBirthDate();
        //Then

        Assert.assertEquals(expName, actualName);
        Assert.assertEquals(expBirthDate, actualBirthDate);

    }
    @Test
    public void animalCreateCatTest(){

        //Given
        String expName = "mully";
        Date expBirthDate = new Date();

        //When
        Cat createCat = AnimalFactory.createCat("mully", expBirthDate);

        String actualName = createCat.getName();
        Date  actualBirthDate = createCat.getBirthDate();
        //Then

        Assert.assertEquals(expName, actualName);
        Assert.assertEquals(expBirthDate, actualBirthDate);

    }


}
