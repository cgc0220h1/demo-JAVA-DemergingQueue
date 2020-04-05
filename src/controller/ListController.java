package controller;
import model.Employee;

import java.util.*;

public class ListController {
    private Queue<Employee> demergeQueueMale = new LinkedList<>();
    private Queue<Employee> demergeQueueFemale = new LinkedList<>();
    private List<Employee> list;

    public ListController(List<Employee> list) {
        this.list = list;
    }

    private void demerge() {
        Iterator<Employee> iterator = list.iterator();
        Employee employee = iterator.next();
        while (iterator.hasNext()) {
            if (employee.getGender()) {
                demergeQueueMale.add(employee);
            } else {
                demergeQueueFemale.add(employee);
            }
        }
    }

    public Queue<Employee> demergeMale() {
        return demergeQueueMale;
    }

    public Queue<Employee> demergeFemale() {
        return demergeQueueFemale;
    }
}
