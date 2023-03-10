public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Указан некорректный возраст человека");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("Не заполнено имя человека");
        } else if (surname == null || surname.isEmpty()) {
            throw new IllegalStateException("Не заполнена фамилия человека");
        }
        Person person = new Person(name, surname, age, address);
        return person;
    }
}
