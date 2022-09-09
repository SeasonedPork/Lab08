package se331com.rest.dao;

import org.springframework.stereotype.Repository;
import se331com.rest.entity.Organizer;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Repository
public class OrganizerDaoImpl implements  OrganizerDao{
    List<Organizer> eventList;
    @PostConstruct
    public void init() {
        eventList = new ArrayList<>();
        eventList.add(Organizer.builder()
                .id(123L)
                .address("Meow Town")
                .name("Kat Laydee")
                .build());
        eventList.add(Organizer.builder()
                .id(456L)
                .address("Flora City")
                .name("Fern Pollen")
                .build());
        eventList.add(Organizer.builder()
                .id(789L)
                .address("Playa Del Carman")
                .name("Carey Wales")
                .build());
        eventList.add(Organizer.builder()
                .id(1001L)
                .address("Woof Town")
                .name("Dawg Dahd")
                .build());
        eventList.add(Organizer.builder()
                .id(1002L)
                .address("Tin City")
                .name("Kahn Opiner")
                .build());
        eventList.add(Organizer.builder()
                .id(1003L)
                .address("Highway 50")
                .name("Brody Kill")
                .build());
    }

    @Override
    public Integer getOrganizerSize() {
        return eventList.size();
    }

    @Override
    public List<Organizer> getOrganizers(Integer pageSize, Integer page) {
        pageSize = pageSize == null ? eventList.size() : pageSize;
        page = page == null ? 1 : page;
       int firstIndex = (page -1) * pageSize;
       return eventList.subList(firstIndex,firstIndex+pageSize);
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return eventList.stream().filter(event ->
                event.getId().equals(id)).findFirst().orElse(null);
    }
}
