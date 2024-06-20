class Main020308 {
    public static String message(String inputMessage) {
        inputMessage = inputMessage + " - is the message";
        return inputMessage;
    }

    public static void main(String[] args) {
        String subject = "It will rain tomorrow";
        System.out.println(subject);

        String newMessage = message(subject);

        System.out.println(subject);
        System.out.println(newMessage);
    }
}
