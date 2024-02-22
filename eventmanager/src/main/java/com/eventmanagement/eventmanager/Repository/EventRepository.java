package com.eventmanagement.eventmanager.Repository;

import com.eventmanagement.eventmanager.Entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Events, Long> {
}
