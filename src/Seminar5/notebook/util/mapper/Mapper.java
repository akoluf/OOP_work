package Seminar5.notebook.util.mapper;

import Seminar5.notebook.model.User;

public interface Mapper {
    String toInput(User e);
    User toOutput(String str);
}
