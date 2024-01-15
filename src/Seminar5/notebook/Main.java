package Seminar5.notebook;

import Seminar5.notebook.controller.UserController;
import Seminar5.notebook.model.repository.GBRepository;
import Seminar5.notebook.model.repository.impl.UserRepository;
import Seminar5.notebook.view.UserView;

import static Seminar5.notebook.util.DBConnector.DB_PATH;
import static Seminar5.notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        GBRepository repository = new UserRepository(DB_PATH);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();

    }
}    