package com.analytics.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.analytics.dto.AnalyticDTO;
import com.analytics.dto.Event;
import com.analytics.dto.StatsResponseDTO;

@Service
public class AnalyticsService {

	private EventDAO eventDAO;

	@Autowired
	public AnalyticsService(EventDAO eventDAO) {
		this.eventDAO = eventDAO;
	}

	@Transactional
	public void createEvent(AnalyticDTO analyticRequest) {
		Event event = new Event();
		event.setName(analyticRequest.getEventName());
		event.setUserId(analyticRequest.getUserId());
		event.setBrowser(analyticRequest.getBrowser());
		event.setDatakey(analyticRequest.getData().getDatakey());
		event.setDatakey2(analyticRequest.getData().getDatakey2());
		eventDAO.createEvent(event);
	}

	@Transactional
	public StatsResponseDTO getStats() {
		StatsResponseDTO stats = new StatsResponseDTO();
		stats.setTotalEventsConsumed(eventDAO.getEventsCount());
		stats.setTotalUniqueUserIds(eventDAO.getUserIdCount());
		return stats;
	}

}
