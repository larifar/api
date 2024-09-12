package com.app.email.api.service;


import com.app.email.api.model.Email;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmailService {

    public Email sendEmail(Email email){
        return email;
    }

    public List<Email> getAllEmails(){
        List<Email> emails = new ArrayList<>();
        emails.add(new Email(1, "jose@hotmail.com","Me adiciona no twitter", "you", "Oi aqui é o josé poderia me adicionar no twitter", LocalDateTime.of(2024, 7, 16, 13, 0)));
        emails.add(new Email(2, "glaucia23@gmail.com.br","Estágio", "you", "Vaga para estágio blablabla", LocalDateTime.of(2024, 7, 26, 19, 0)));
        emails.add(new Email(3, "promocoesExtra@yohoo.com","Aproveite agora essas promoções", "you", "Promoção na venda de eletrônicos, eletrodomésticos e muito mais", LocalDateTime.of(2024, 8, 1, 7, 0)));
        emails.add(new Email(4, "cupomania769@gmail.com","Cupons apenas para você", "you", "Cupomania te dá cashback", LocalDateTime.of(2024, 8, 9, 10, 0)));
        emails.add(new Email(5, "ricardinho@hotmail.com","Oi", "you", "Novo update no meu site, veja agora", LocalDateTime.of(2024, 9, 2, 13, 0)));
        return emails;
    }

    public Email getEmail(Long id){
        return getAllEmails().stream().filter(email -> email.getId() == id).findFirst().orElse(null);
    }

}
