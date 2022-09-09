package se331com.rest.service;

import se331com.rest.entity.Organizer;

import java.util.List;

public interface OrganizerService {
    Integer getOrganizerSize();
    List<Organizer> getOrganizers(Integer pageSize,Integer page);
    Organizer getOrganizer(Long id);
}
