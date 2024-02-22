package com.eventmanagement.eventmanager.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EVENTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Events {

    @Id
    @GeneratedValue
    private Long eventId;
    private String eventName;
    private String description;
    private String startDate;
    private String endDate;
    private String venue;
}
