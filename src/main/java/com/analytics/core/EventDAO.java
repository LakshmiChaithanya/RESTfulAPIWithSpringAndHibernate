package com.analytics.core;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.analytics.dto.Event;

@Repository
public class EventDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public Event createEvent(Event event) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(event);
		return event;
	}
	
	public long getEventsCount(){
		long totalResults = 0;
		String queryString = "select count(*) from Event";
		Query query = sessionFactory.getCurrentSession().createQuery(queryString);

		List countResult = query.list();
		if (countResult.size() > 0) {
			totalResults = (Long) countResult.get(0);
		}
		return totalResults;
	}
	

	public long getUserIdCount(){
		long totalResults = 0;
		String queryString = "select count(distinct userId) from Event";
		Query query = sessionFactory.getCurrentSession().createQuery(queryString);

		List countResult = query.list();
		if (countResult.size() > 0) {
			totalResults = (Long) countResult.get(0);
		}
		return totalResults;
	}
	
	

}
