public class Ship {
  private final double draft;
  private final int crew;
    
  public Ship(double draft, int crew) {
    this.draft = draft;
    this.crew = crew;
  }
  
  public boolean isWorthIt() {
    if ((this.draft - this.crew * 1.5) > 20) {
        return true;
      } else {
        return false;
      }
  }
}