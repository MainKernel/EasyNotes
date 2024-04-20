package com.easynotes.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author mightyloot
 *
 * UrlEntity class for Hibernate enetity mapping
 *
 * */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "urls")
public class UrlEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;
    private String url;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private UserEntity user;
}
