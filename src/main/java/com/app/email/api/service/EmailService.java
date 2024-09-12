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
        emails.add(new Email(6, "maria.silva@gmail.com", "Convite de casamento", "you", "Você está convidado para o meu casamento", LocalDateTime.of(2024, 9, 4, 14, 0)));
        emails.add(new Email(7, "pedro.lima@outlook.com", "Reunião importante", "you", "Por favor, confirme sua presença na reunião de amanhã", LocalDateTime.of(2024, 9, 6, 9, 30)));
        emails.add(new Email(8, "newsletter@shopping.com", "Novidades da semana", "you", "Confira os novos produtos da nossa loja", LocalDateTime.of(2024, 9, 8, 8, 0)));
        emails.add(new Email(9, "cursos@onlinelearning.com", "Certificado de conclusão", "you", "Parabéns por concluir o curso, aqui está o seu certificado", LocalDateTime.of(2024, 9, 9, 11, 0)));
        emails.add(new Email(10, "joana.pereira@yahoo.com", "Encontro de ex-alunos", "you", "Gostaria de convidá-lo para o encontro de ex-alunos", LocalDateTime.of(2024, 9, 10, 17, 0)));
        emails.add(new Email(11, "financeiro@empresa.com", "Fatura disponível", "you", "Sua fatura de setembro já está disponível", LocalDateTime.of(2024, 9, 11, 12, 0)));
        emails.add(new Email(12, "lucas.vieira@gmail.com", "Parabéns!", "you", "Feliz aniversário! Espero que você tenha um ótimo dia", LocalDateTime.of(2024, 9, 12, 10, 30)));
        emails.add(new Email(13, "revista@saudeemfoco.com", "Dicas de saúde", "you", "Confira as dicas para melhorar sua alimentação", LocalDateTime.of(2024, 9, 12, 7, 0)));
        emails.add(new Email(14, "eventos@ticketshop.com", "Ingressos disponíveis", "you", "Compre ingressos para shows e eventos", LocalDateTime.of(2024, 9, 12, 15, 0)));
        emails.add(new Email(15, "atendimento@bancox.com", "Atualização de dados", "you", "Precisamos que você atualize seus dados cadastrais", LocalDateTime.of(2024, 9, 12, 16, 0)));

        return emails;
    }

    public Email getEmail(Long id){
        return getAllEmails().stream().filter(email -> email.getId() == id).findFirst().orElse(null);
    }

}
