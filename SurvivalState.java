public class SurvivalState implements PlayerState {


   public SurvivalState() {

   }
   
   
   @Override
   public void action(Player p) {
      p.survive();
   }

}