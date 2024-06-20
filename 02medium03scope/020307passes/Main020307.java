class Main020307 {
    // public static String userNameError() {
    //     return firstName + " - " + lastName;
    // }

    public static String userName(String firstName, String lastName) {
        return firstName + " - " + lastName;
    }

    public static void main(String[] args) {
        String firstName = "Fernando";
        String lastName = "Yamato";

        System.out.println(firstName + " - " + lastName);

        // System.out.println(userNameError());

        System.out.println(userName(firstName, lastName));
    }
}
