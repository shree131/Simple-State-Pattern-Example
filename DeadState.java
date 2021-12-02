public class DeadState implements PlayerState {

   
   public DeadState() {
    
   }
   
   @Override
   public void action(Player p) {
   
      p.dead();
   }

}