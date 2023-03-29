package api.utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviders {
    @DataProvider(name = "Data")
    public Object[][] getAllData() throws IOException {
        String path = System.getProperty("user.dir") + "//testData//UserData.xlsx";
        XLUtility xl = new XLUtility(path);

        int rowNum = xl.getRowCount("Hoja 1");
        int colCount = xl.getCellCount("Hoja 1", 1);

        Object[][] apiData = new String[rowNum][colCount];

        for (int i = 1; i <= rowNum; i++) {
            for (int j = 0; j < colCount; j++) {
                apiData[i - 1][j] = xl.getCellData("Hoja 1", i, j);
            }
        }
        return apiData;
    }

    @DataProvider(name = "UserNames")
    public Object[] getUserNames() throws IOException {
        String path = System.getProperty("user.dir") + "//testData//UserData.xlsx";
        XLUtility xl = new XLUtility(path);

        int rowNum = xl.getRowCount("Hoja 1");

        Object[] apiData = new String[rowNum];

        for (int i = 1; i <= rowNum; i++) {
            apiData[i - 1] = xl.getCellData("Hoja 1", i, 1);
        }
        return apiData;
    }
}
