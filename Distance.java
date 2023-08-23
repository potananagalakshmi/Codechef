// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

class distane {
   distane() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();
      int var4 = var1.nextInt();
      int var5 = var1.nextInt();
      int var6 = (var3 - var2) * (var3 - var2) + (var5 - var4) * (var5 - var4);
      System.out.printf("%0.4f", Math.sqrt((double)var6));
   }
}
