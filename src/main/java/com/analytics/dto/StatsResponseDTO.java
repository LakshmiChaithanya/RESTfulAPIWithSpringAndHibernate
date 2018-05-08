package com.analytics.dto;

public class StatsResponseDTO {

	private long totalEventsConsumed;
	private long totalUniqueUserIds;

	public long getTotalEventsConsumed() {
		return totalEventsConsumed;
	}

	public void setTotalEventsConsumed(long totalEventsConsumed) {
		this.totalEventsConsumed = totalEventsConsumed;
	}

	public long getTotalUniqueUserIds() {
		return totalUniqueUserIds;
	}

	public void setTotalUniqueUserIds(long totalUniqueUserIds) {
		this.totalUniqueUserIds = totalUniqueUserIds;
	}

}
