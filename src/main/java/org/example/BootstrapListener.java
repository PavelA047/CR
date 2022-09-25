package org.example;

import org.example.persist.User;
import org.example.persist.UserRepository;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class BootstrapListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        UserRepository userRepository = new UserRepository();
        userRepository.insert(new User("Alex"));
        userRepository.insert(new User("Petr"));
        userRepository.insert(new User("Filip"));
        userRepository.insert(new User("NEWWWWWW"));
        sce.getServletContext().setAttribute("userRepository", userRepository);
    }
}
