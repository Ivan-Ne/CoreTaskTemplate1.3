package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        // реализуйте алгоритм здесь

        Class.forName("com.mysql.cj.jdbc.Driver");

        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();

        User user1 = new User("Ivan", "Ivanov", (byte) 22);
        User user2 = new User("Jenny", "Petrova", (byte) 99);
        User user3 = new User("Zaur", "Zaurov", (byte) 35);
        User user4 = new User("Ann", "Weins", (byte) 18);

        userDaoJDBC.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        userDaoJDBC.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        userDaoJDBC.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        userDaoJDBC.saveUser(user4.getName(), user4.getLastName(), user4.getAge());

        userDaoJDBC.getAllUsers();
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();
    }
}
