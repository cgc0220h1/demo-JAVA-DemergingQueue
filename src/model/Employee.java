package model;

public class Employee {
    private String name;
    private boolean gender;
    private int[] birth;

    public Employee(String name, boolean gender, int[] birth) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getBirth() {
        return birth;
    }

    public void setBirth(int[] birth) {
        this.birth = birth;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
