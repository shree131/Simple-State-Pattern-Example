public class Driver {

   public static void main(String args[]) {
   
      GameContext gc = new GameContext();
      Player p = new Player();
      
      
      // Healthy State
      gc.setState(new HealthyState());
      
      gc.gameAction();
      
      System.out.println("\n****************");
      
      // Survival State
      gc.setState(new SurvivalState());
      
      gc.gameAction();
      
      System.out.println("\n****************");
      
      // Dead State
      gc.setState(new DeadState());
      
      gc.gameAction();
      
      System.out.println("\n****************");
      
   }

}