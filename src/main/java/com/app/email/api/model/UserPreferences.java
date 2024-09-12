package com.app.email.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_preferences")
public class UserPreferences {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long user_id;
    private String theme;
    @Column(name = "font_size")
    private String fontSize;
}
