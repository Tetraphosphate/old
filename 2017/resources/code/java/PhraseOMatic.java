import java.lang.Math;
import java.lang.Object;
import java.util.Scanner;
import java.util.Random;

public class PhraseOMatic {
  public static void main(String[] args) {
    String [] word1 = {"Have you seen our ", "Check out our ", "On sale now: our ", "Buy one get one half price: our "};
    String [] word2 = {"all-new ", "wonderful ", "shiny ", "luxury ", "amazing ", "neat ", "crazy ", "trendy new ", "magnificent ", "awe-inspiring "};
    String [] word3 = {"one-of-a-kind ", "flavourful ", "antique ", "malleable ", "low-maintenance "};
    String [] product = {"cookies ", "ploombars ", "trombones ", "mechanized cats ", "portable tables ", "futuristic t-shirts "};
    
    Random random = new Random();
    int i = random.nextInt(word1.length);
    String one = word1[i];
    
    i = random.nextInt(word2.length);
    String two = word2[i];
    
    i = random.nextInt(word3.length);
    String three = word3[i];
    
    i = random.nextInt(product.length);
    String four = product[i];
    
    System.out.println(one + two + three + four);
  }
}
