package APITEST;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;



import org.junit.Test;


import API.CachedDate;
import API.GetData;
import API.cacheddatabase;

public class CacheddataTest {
	
	
	@Test	
	public void checkgetdata3() {
		GetData  dt=new GetData("italy");
		dt.getdata();
		assertTrue(dt.isEstablishconnectionwithapi());
		dt.getdata();
		assertFalse(dt.isEstablishconnectionwithapi());
		
		
	}

	/*
	@Test
	public void checkdataincache() {
		GetData  dt=new GetData("spain");
		cacheddatabase db=Mockito.mock(cacheddatabase.class);
		 CachedDate cd=new CachedDate("", "spain");

		Mockito.doReturn(false).when(db).checkExistence(cd);
		assertFalse(dt.checkdataincach());
	}
	*/
	


	
	

}
