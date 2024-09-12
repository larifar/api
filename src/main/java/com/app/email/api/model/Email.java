package com.app.email.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    private long id;

    private String sender;
    private String title;
    private String receiver;
    private String content;
    private LocalDateTime date;

}
