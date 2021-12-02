public class HealthyState implements PlayerState {
   
   
   public HealthyState() {
     
   }
   
   
   public void action(Player p) {
      p.attack();
      p.fireBomb();
      p.firePistol();
      p.fireGunblade();
      p.fireLaserPistol();
   
   }

}