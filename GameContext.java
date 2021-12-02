public class GameContext {

   private PlayerState state;
   private Player p = new Player();
   
   public GameContext() {
      
   }
   
   public void setState(PlayerState state) {
      this.state = state;
   }
   
   public void gameAction() {
      state.action(p);
   }
   

}