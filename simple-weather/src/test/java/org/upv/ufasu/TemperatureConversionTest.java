package org.upv.ufasu;

import java.io.InputStream;

import junit.framework.TestCase;

import org.upv.ufasu.weather.TemperatureConversor;

public class TemperatureConversionTest extends TestCase {
	
	public TemperatureConversionTest(String name){
		super(name);
	}
	
	public void testParser() throws Exception {
		TemperatureConversor tc=new TemperatureConversor();
		
		System.out.println("Llamo al Parser " +tc.parse("50"));
		assertEquals( "10",tc.parse("50"));
		}


}
