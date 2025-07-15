package com.engripaye.complete_iam_system.database;

import com.engripaye.complete_iam_system.model.User;
import com.engripaye.complete_iam_system.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DatabaseInitialization implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... arg) throws Exception {
        userRepository.deleteAll();

        User user = new User();
        user.setUsername("user");
        user.setPassword(passwordEncoder.encode("password"));
        user.setRole("ROLE_USER");
        userRepository.save(user);


        User admin = new User();
        admin.setUsername("admin");
        admin.setPassword(passwordEncoder.encode("password"));
        admin.setRole("ROLE_ADMIN");
        userRepository.save(admin);
    }
}
