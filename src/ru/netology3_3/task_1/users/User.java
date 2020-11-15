package ru.netology3_3.task_1.users;

import ru.netology3_3.task_1.interfaces.BasicUser;

public abstract class User implements BasicUser {

    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public User(String fullName) {
        this.fullName = fullName;
    }

}
