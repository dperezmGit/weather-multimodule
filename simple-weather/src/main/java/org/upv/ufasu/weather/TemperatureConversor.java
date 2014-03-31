package org.upv.ufasu.weather;

public class TemperatureConversor {

	public TemperatureConversor() {
		// TODO Auto-generated constructor stub
	}
	
	public String parse(String valor) throws Exception{
		Integer v=Integer.valueOf(valor);
		int result= (int) ((v-32)/1.8);
		return String.valueOf(result);
	}
	
	

}
