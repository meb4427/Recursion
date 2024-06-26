class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}

class Main {
    public static String changePersonState(Person inputPerson) {
        inputPerson = new Person(inputPerson.firstName, inputPerson.lastName);
        inputPerson.firstName = "Denice";
        inputPerson.lastName = "Harrison";
        return inputPerson.getFullName();
    }

    public static void main(String[] args) {
        Person carly = new Person("Carly", "Angelo");

        // carly のメモリアドレスを表示します。これがオブジェクト参照です
        // オブジェクト自体はヒープに格納されており、変数の中に格納されているものは参照(メモリアドレス)です
        System.out.println(carly);
        System.out.println(carly.getFullName());

        changePersonState(carly);

        System.out.println(carly.getFullName());
    }
}