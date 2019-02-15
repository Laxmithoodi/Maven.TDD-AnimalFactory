package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    @Test
    public void addCatTest(){
    //Given
        Date birthDate = new Date();
        Cat addCat = new Cat("mully", birthDate, 1);

     //When
        CatHouse.add(addCat);
        int addCat1 = CatHouse.getNumberOfCats();


     //Then
        Assert.assertEquals(1, addCat1);


    }

    @Test

    public void removeCatTest(){
        //Given
        Date birthDate = new Date();
        Cat addCat = new Cat("mully", birthDate, 1);
        //When
        CatHouse.add(addCat);
        int expCat = CatHouse.getNumberOfCats();

        CatHouse.remove(addCat);
        expCat = expCat-1;
        int actualRemoveCat = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expCat, actualRemoveCat);

    }
    @Test

    public void removeIntegerIDTest(){
        //Given
        Date birthDate = new Date();
        Cat addCat = new Cat("mully", birthDate, 2);
        //When
        CatHouse.remove(2);
        Cat actualCat = CatHouse.getCatById(2);
        //Then
        Assert.assertNull(actualCat);

    }

    @Test

    public void getCatByIdTest(){

        //Given
        Date birthDate = new Date();
        Cat cat = new Cat("mully", birthDate, 2);

        CatHouse.add(cat);
        //When
        Cat cat1 = CatHouse.getCatById(2);
        //Then
        Assert.assertNotNull(cat);
    }

    @Test

    public void getNumberOfCatsTest(){

        //Given
        Date birthDate = new Date();
        Cat cat = new Cat("mully", birthDate, 2);
        CatHouse.clear();

        CatHouse.add(cat);
        CatHouse.add(cat);
        Integer expNumberofCats = 2;
        //When
        Integer actualNumberofCats = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expNumberofCats, actualNumberofCats);


    }


}
