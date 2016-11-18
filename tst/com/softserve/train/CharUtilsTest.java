package com.softserve.train;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CharUtilsTest {
	
    @DataProvider
    public Object[][] ValidDataProvider( ) {
        return new Object[ ][ ]{
                { 'A', 65 },  { 'a', 97 },
                { 'B', 66 },  { 'b', 98 },
                { 'C', 67 },  { 'c', 99 },
                { 'D', 68 },  { 'd', 100 },
                { 'Z', 90 },   { 'z', 122 },
                { '1', 49 },   { '9', 57 },  };
    }

	@Test(dataProvider = "ValidDataProvider")
	public void CharToASCIITest(final char character, final int ascii) {
		int result = CharUtils.CharToASCII(character);
		Assert.assertEquals(result, ascii);
	}

	@Test(dataProvider = "ValidDataProvider")
	public void ASCIIToCharTest(final char character, final int ascii) {
		char result = CharUtils.ASCIIToChar(ascii);
		Assert.assertEquals(result, character);
	}

}
