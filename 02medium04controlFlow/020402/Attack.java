class Attack {
    public static String monsterAttackExpressionNest(String monster) {
        int attack = 1000;
        String message = "'s attack is: ";

        return monster == "Cyclops" ? "Cyclops" + message + attack * 1.8
                : monster == "Ogre" ? "Ogre" + message + attack * 2.5
                        : monster == "Zombie" ? "Zombie" + message + attack * 1.2
                                : "Monster does not exist.";
    }

    public static void main(String[] args) {
        System.out.println(monsterAttackExpressionNest("Cyclops"));
        System.out.println(monsterAttackExpressionNest("Ogre"));
        System.out.println(monsterAttackExpressionNest("Zombie"));
        System.out.println(monsterAttackExpressionNest("Ghost"));
    }
}
