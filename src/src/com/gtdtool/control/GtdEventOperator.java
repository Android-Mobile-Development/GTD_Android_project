/**
 * 
 */
package com.gtdtool.control;

import java.util.ArrayList;
import java.util.List;

import com.gtdtool.object.GtdEvent;

/**
 * @author Andrew
 *
 */
public class GtdEventOperator {
	List<GtdEvent> events;

	/**
	 * Default
	 */
	public GtdEventOperator() {
		super();
		this.events = new ArrayList<GtdEvent>();
	}
	
	/**
	 * @param events
	 */
	public GtdEventOperator(List<GtdEvent> events) {
		super();
		this.events = events;
	}

	public List<GtdEvent> getEvents() {
		return events;
	}

	/**
	 * TODO
	 */
	public void doLoadGtdEvents(){
		
	}
	
	/**
	 * TODO
	 */
	public void doSaveGtdEvents(){
		
	}
	
	/**
	 * TODO
	 */
	public void addGtdEvents(){
		
	}
	

	/**
	 * TODO
	 */
	public void deleteGtdEvents(){
		
	}
	

	/**
	 * TODO
	 */
	public void deleteAllGtdEvents(){
		
	}

}