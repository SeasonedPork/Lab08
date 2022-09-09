package se331com.rest.dao;

import se331com.rest.entity.Organizer;
import se331com.rest.entity.Organizer;

import java.util.List;

public interface OrganizerDao {
    Integer getOrganizerSize();
    List<Organizer> getOrganizers(Integer pageSize, Integer  page);
    Organizer getOrganizer(Long id);
}
