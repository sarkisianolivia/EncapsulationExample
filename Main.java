public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Olivia";
//        player.health= 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Olive", 200, "Sword");
        System.out.println("Initial health is " + player.getHitPoints());

        //use the getter to access the method when all the other fields are private
        //always create private fields
    }


}
