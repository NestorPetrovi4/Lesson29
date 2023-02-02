public class Main {
    public static void main(String[] args) {

        Person daddy = new PersonBuilder()
                .setName("Oleg")
                .setSurname("Nesterov")
                .build();
        daddy.setAddress("Moskow");

        if (daddy.hasAge()) {
            daddy.happyBirthday();
        } else {
            while (daddy.getAge() < 37) {
                daddy.happyBirthday();
            }
        }
        System.out.println(daddy);
        PersonBuilder sonBuilder = daddy.newChildBuilder()
                .setName("Gleb").setAge(4);
        Person son = sonBuilder.build();


        System.out.println("У папы " + daddy + " есть сын \n" + son);
    }
}
