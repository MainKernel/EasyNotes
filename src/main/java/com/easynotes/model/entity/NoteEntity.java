package com.easynotes.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
/**
 * @author mightyloot
 *
 * NoteEntity class for Hibernate enetity mapping
 *
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
@Table(name = "notes")
public class NoteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private UserEntity user;
    private LocalDateTime createdAt;
}
