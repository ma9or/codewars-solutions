public class Bob {
  public static int enough(int cap, int on, int wait){
  int free_sits = cap-on;
  if (wait > free_sits) {
    return wait - free_sits;
  }
  return 0;
  }
}