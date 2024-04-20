package com.easynotes.model.service;

import com.easynotes.model.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author mightyloot
 * */

@Service
public class NotificationService {
    private NotificationRepository notificationRepository;

    @Autowired
    private void setDependencies(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }
}
