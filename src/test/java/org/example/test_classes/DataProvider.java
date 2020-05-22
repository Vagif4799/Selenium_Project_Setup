package org.example.test_classes;

import org.testng.annotations.Test;

public class DataProvider {

    @Test(dataProvider = "getData")
    public void setData(String username, String password) {

        System.out.println(username);
        System.out.println(password);

    }

    @org.testng.annotations.DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[1][2];

        data[0][0] = "Quliyev4799";
        data[0][1] = "qaqash99";

        return data;
    }

}
