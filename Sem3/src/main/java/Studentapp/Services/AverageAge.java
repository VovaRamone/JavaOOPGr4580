package Studentapp.Services;

import Studentapp.Domen.Person;

import java.util.List;

public class AverageAge<T extends Person> {
    private List<T> personList;

    public AverageAge(List<T> personList) {
        this.personList = personList;
    }

    public double calculateAverageAge() {
        int totalAge = 0;
        for (T person : personList) {
            totalAge += person.getAge();
        }
        return (double) totalAge / personList.size();
    }
}

