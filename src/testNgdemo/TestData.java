package testNgdemo;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name="loginData")
    public Object[][] data2(){
        Object[][] data= new Object[2][2];
        data[0][0]="user1";
        data[0][1]="pass1";
        data[1][0]="user2";
        data[1][1]="123456";
        return data;
    }

}
