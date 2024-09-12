package com.app.email.api.repository;

import com.app.email.api.model.UserPreferences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserPreferencesRepo extends JpaRepository<UserPreferences, Long> {
    @Query("SELECT u FROM UserPreferences u WHERE u.user_id = :userId")
    Optional<UserPreferences> findByUserId(@Param("userId")long userId);
}
