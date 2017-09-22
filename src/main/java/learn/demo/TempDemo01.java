package learn.demo;

public class TempDemo01 {
   private final char value[];
   public TempDemo01() {
	   this.value = new char[0];
   }
   public TempDemo01(TempDemo01 abc) {
	   this.value = abc.value;
   }
}
