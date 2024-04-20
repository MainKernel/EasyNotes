package com.easynotes.model.repository;

import com.easynotes.model.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author mightyloot
 */
@Repository
public interface NoteRepository extends JpaRepository<NoteEntity, Long> {

}
