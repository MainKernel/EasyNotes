package com.easynotes.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
/**
 * @author mightyloot
 *
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
@Table(name = "notifications")
public class NotificationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private UserEntity user;
    @Enumerated(value = EnumType.STRING)
    @Builder.Default
    private Status status = Status.PENDING;
    private LocalDateTime notificationTime;

    public enum Status {
        PENDING,
        FINISHED,
        CANCELED
    }

}
