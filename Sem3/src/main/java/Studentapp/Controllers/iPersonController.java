package Studentapp.Controllers;

import Studentapp.Domen.Person;

public interface iPersonController<T extends Person> {
    void create(String firstName, int age);
}
