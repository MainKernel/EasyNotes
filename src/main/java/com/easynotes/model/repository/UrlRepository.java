package com.easynotes.model.repository;

import com.easynotes.model.entity.UrlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author mightyloot
 *
 *
 * */
@Repository
public interface UrlRepository extends JpaRepository<UrlEntity, Long> {

}
