package se331com.rest.dao;

import se331com.rest.entity.Event;

import java.util.List;

public interface EventDao {
    Integer getEventSize();
    List<Event> getEvents(Integer pageSize, Integer  page);
    Event getEvent(Long id);
}
