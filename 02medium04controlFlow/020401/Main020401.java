class Main020401 {
    public static String monsterAttack(String monster) {
        int attack = 1000;
        String message = "'s attack is ";

        // switch文
        switch (monster) {
            case "Cyclops":
                attack *= 1.8;
                message = "Cyclops" + message + attack;
                break;
            case "Ogre":
                attack *= 2.5;
                message = "Ogre" + message + attack;
                break;
            case "Zombie":
                attack *= 1.2;
                message = "Zombie" + message + attack;
                break;
            default:
                message = "Monster does not exist.";
        }

        // // if文
        // if (monster == "Cyclops") {
        // attack *= 1.8;
        // message = "Cyclops" + message + attack;
        // } else if (monster == "Ogre") {
        // attack *= 2.5;
        // message = "Ogre" + message + attack;
        // } else if (monster == "Zombie") {
        // attack *= 1.2;
        // message = "Zombie" + message + attack;
        // } else {
        // message = "Monster does not exist.";
        // }

        return message;
    }

    public static void main(String[] args) {
        System.out.println(monsterAttack("Cyclops"));
        System.out.println(monsterAttack("Ogre"));
        System.out.println(monsterAttack("Zombie"));
        System.out.println(monsterAttack("Ghost"));
    }
}
