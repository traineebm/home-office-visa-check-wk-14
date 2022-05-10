package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
public class TestData {


    @DataProvider(name = "credentials")
    public Object [][] getData (){

        Object [][] data = new Object[][]{

                {"test1@gmail.com", "test123", "error message"},
                {"test2@gmail.com", "test789"},
                {"test3@gmail.com", "test456"},

        };
        return data;
    }

}
