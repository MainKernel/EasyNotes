package com.easynotes.model.repository;

import com.easynotes.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**@author mightyloot
 *
 * */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    /** findByUsername method
     * First of all this method used by spring security to auth user from user in the database
     *
     * @param username searching username in the database.
     * @return Optional.of(UserEntity) = need to provide validation that user not null if using this method;
     *
     * */
    Optional<UserEntity> findByUsername(String username);

    Optional<UserEntity> findByEmail(String email);
}
