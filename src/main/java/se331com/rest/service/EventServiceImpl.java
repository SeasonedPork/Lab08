package se331com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se331com.rest.dao.EventDao;
import se331com.rest.entity.Event;

import java.util.List;

@Service
public class EventServiceImpl implements EventService{
    @Autowired
    EventDao eventDao;
    @Override
    public Integer getEventSize() {
        return eventDao.getEventSize();
    }

    @Override
    public List<Event> getEvents(Integer pageSize, Integer page) {
        return eventDao.getEvents(pageSize,page);
    }

    @Override
    public Event getEvent(Long id) {
        return eventDao.getEvent(id);
    }
}
