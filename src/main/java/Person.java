public class Person {
    private final String name;
    private final String surname;
    private int age;
    private boolean hasAge = false;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        hasAge = age != 0;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        hasAge = age != 0;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void happyBirthday() {
        age++;
        if (!hasAge) {
            hasAge = true;
        }
    }

    public boolean hasAge() {
        return hasAge;
    }

    public boolean hasAddress() {
        return address != null && !address.isEmpty();
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname)
                .setAddress(address)
                .setAge(age);
    }

    public void setAddress(String city) {
        address = city;
    }

    @Override
    public String toString() {
        return surname + " " + name + " возраст: " + (hasAge ? age : "не установлен ")
                + " проживает: " + (hasAddress() ? address : "без установленного места жительства");
    }
}
