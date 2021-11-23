import java.sql.SQLOutput;

public class Modulo {
    public static void sheesh(){
        int hope = 7;
        for (int i = 1; i <= 200; i++) {
            if (i / hope == 1){

                hope += 7;

            } else {

                System.out.println(i);

            }
        }
    }

    public static void modulo(int x, int teiler) {
      int y = x/teiler*teiler;
      x = x - y;

        System.out.println(x);
    }

    public static void main(String[] args) {
        sheesh();

        modulo(150405, 30498);
    }
}
