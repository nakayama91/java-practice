public class Greeting {
  public static void main(String[] args) {
    // int time = 9;
    // System.out.println("只今の時刻は" + time + "時です");
    // System.out.println("おはようございます");
    // 出力:javac -encoding UTF-8 Greeting.java
    //      java Greeting
    int time = 9;
    if ((time >= 4) && (time <= 10)) {
      System.out.println("只今の時刻は" + time + "時です");
      System.out.println("おはようございます");
    } else if ((time >= 11) && (time <= 17)) {
      System.out.println("只今の時刻は" + time + "時です");
      System.out.println("こんにちは");
    } else if (time == 18) {
      System.out.println("只今の時刻は" + time + "時です");
      System.out.println("こんばんは");
    } else if ((time >= 19) && (time <= 3)) {
      System.out.println("只今の時刻は" + time + "時です");
      System.out.println("おやすみなさい");
    }
  }
}