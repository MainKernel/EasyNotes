package com.easynotes.model.repository;

import com.easynotes.model.entity.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author mightyloot
 *
 * */
@Repository
public interface NotificationRepository extends JpaRepository<NotificationEntity, Long> {
}
