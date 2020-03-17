package APITEST;

import static org.junit.Assert.*;

import org.json.JSONException;
import org.junit.Test;

import API.APIdata;

public class ApiIntegrationTest {
	APIdata jsdata=new APIdata();
	
	@Test
	public void CountryCurrenciesInfoTest() throws JSONException {
	
		assertEquals(" Country's Currencies Name is Colombian peso of Code COP and It's Symbol is $", jsdata.GetCountryCurrenciesInfo());

	}

}


