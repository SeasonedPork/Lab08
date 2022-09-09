package se331com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se331com.rest.dao.OrganizerDao;
import se331com.rest.entity.Organizer;

import java.util.List;

@Service
public class OrganizerServiceImpl implements OrganizerService{
    @Autowired
    OrganizerDao eventDao;
    @Override
    public Integer getOrganizerSize() {
        return eventDao.getOrganizerSize();
    }

    @Override
    public List<Organizer> getOrganizers(Integer pageSize, Integer page) {
        return eventDao.getOrganizers(pageSize,page);
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return eventDao.getOrganizer(id);
    }
}
