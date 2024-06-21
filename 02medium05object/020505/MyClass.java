class MyClass {
    public static void main(String[] args) {
        Person mike = new Person("Michael", "Johnson");
        System.out.println(mike.getFullName()); // Michael Johnson
        System.out.println(mike.getInitial()); // M.J

        Person carly = new Person("Carly", "Angelo");
        System.out.println(carly.getFullName()); // Carly Angelo
        System.out.println(carly.getInitial()); // C.A

        Person jessie = new Person("Jessie", "Raelynn");
        System.out.println(jessie.getFullName()); // Jessie Raelynn
        System.out.println(jessie.getInitial()); // J.R
    }
}

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

    public String getInitial() {
        return this.firstName.charAt(0) + "." + this.lastName.charAt(0);
    }
}