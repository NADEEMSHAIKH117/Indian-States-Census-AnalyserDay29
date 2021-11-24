

import org.junit.Assert;
import org.junit.Test;



public class CensusAnalyserTest {
	private String INDIAN_CENSUS_CSV_FILE_PATH="C:\\Users\\Nadeem Shaikh\\eclipse-workspace\\India_States_Census_Day29\\src\\main\\resources\\IndiaStateCensusData.csv";

	
	// Tc1.1
	 @Test
	    public void givenIndianCensusCSVFile_WhenLoad_ShouldReturnCorrectRecords() {
	        CensusAnalyser censusAnalyser = new CensusAnalyser();
	        int count = censusAnalyser.loadIndiaCensusData(INDIAN_CENSUS_CSV_FILE_PATH);
	        Assert.assertEquals(29,count);
	    }
	
}
