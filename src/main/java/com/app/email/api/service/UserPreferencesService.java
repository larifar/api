package com.app.email.api.service;

import com.app.email.api.model.UserPreferences;
import com.app.email.api.repository.UserPreferencesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserPreferencesService {
    @Autowired
    private UserPreferencesRepo repo;

    public UserPreferences save(UserPreferences userPreferences){
        Optional<UserPreferences> existingPreferences = repo.findByUserId(userPreferences.getUser_id());

        if (existingPreferences.isPresent()) {
            UserPreferences preferencesToUpdate = existingPreferences.get();
            preferencesToUpdate.setTheme(userPreferences.getTheme());
            preferencesToUpdate.setFontSize(userPreferences.getFontSize());
            return repo.save(preferencesToUpdate);
        } else {
            return repo.save(userPreferences);
        }
    }

    public UserPreferences get(Long id){
        Optional<UserPreferences> existingPreferences = repo.findByUserId(id);
        return existingPreferences.orElse(null);
    }
}
