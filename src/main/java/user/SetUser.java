package user;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SetUser {
    public static void main(String[] args) {
        // Використовуємо налаштування за замовчуванням (якщо файл hibernate.cfg.xml розташований правильно)
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        try {
            UserDAO userDAO = new UserDAO(sessionFactory);
            User user = new User();
            user.setFirstName("John");
            user.setLastName("Doe");
            user.setUserNumber("12345");

            userDAO.saveUser(user);
        } finally {
            sessionFactory.close();
        }
    }
}