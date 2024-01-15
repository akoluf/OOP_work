package Seminar5.notebook.view;

import Seminar5.notebook.controller.UserController;
import Seminar5.notebook.model.User;
import Seminar5.notebook.util.Commands;

import java.util.Scanner;

import static Seminar5.notebook.model.repository.impl.UserRepository.createUser;
import static Seminar5.notebook.model.repository.impl.UserRepository.prompt;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com;

        while (true) {
            String command = prompt("Введите команду: ");
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    User u = createUser();
                    userController.saveUser(u);
                    break;
                case READ:
                    String id = prompt("Идентификатор пользователя: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case UPDATE:
                    String userId = prompt("Enter user id: ");
                    userController.updateUser(userId, createUser());
                case LIST:
                    System.out.println(userController.readAll());
                    break;
                case DELETE:
                    String deleteUserId = prompt("Enter user the id you want to delete: ");
                    userController.deleteUser(Long.valueOf(deleteUserId));
                    break;
            }
        }
    }


}


