package org.telchak.test.run;

import java.util.HashMap;

public class Globals {
	
	private static final ThreadLocal< HashMap<String, Object> > concurrentMap = new ThreadLocal< HashMap< String, Object > >();
	
	
	/*
	 * Ctor to initialise the value
	 */
	public Globals() {
		concurrentMap.set( new HashMap<String,Object>() );
	}
	
	/**
	 * sets the named value for later retreival
	 * @param name string name
	 * @param value Object - any type or custom object
	 */
	public void setGlobalValue(String name, Object value) {
		concurrentMap.get().put( name, value );
	}
	
	/**
	 * 
	 * @param <T> the return type
	 * @param name named identifier
	 * @return Type case value
	 */
	@SuppressWarnings("unchecked")
	public <T> T getGlobalValue( String name ) {
		
		T output = null;
	    try {
	        output = (T) concurrentMap.get().get(name);
	        System.out.println(output.getClass());
	    } catch (ClassCastException e) {
	        System.out.println("class cast caught");
	        return null;
	    }
	    return output;
	}

}
