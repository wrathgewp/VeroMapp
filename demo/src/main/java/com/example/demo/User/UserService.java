package com.example.demo.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public void createUser(User user) {
        user.setPass(passwordEncoder.encode(user.getPass()));
        userRepository.save(user);
    }

    public void encryptExistingPasswords() {
        List<User> users = userRepository.findAll();
    
        for (User user : users) {
            if (!user.getPass().startsWith("$2a$")) {  // Verifica se la password è già criptata
                System.out.println("Criptando la password per l'utente: " + user.getUser());
                String encodedPassword = passwordEncoder.encode(user.getPass());
                user.setPass(encodedPassword);
                userRepository.save(user);  // Salva l'utente con la password criptata
            }
        }
    }    
}
