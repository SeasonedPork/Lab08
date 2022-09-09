package se331com.rest.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Organizer {
    Long id;
    String category;
    String title;
    String description;
    String location;
    String date;
    String time;
    Boolean petAllowed;
    String name;
    String address;
}
