import java.util.Scanner;

    public class DeadHead_s {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n, m, k;
            n = scanner.nextInt();
            m = scanner.nextInt();
            k = scanner.nextInt();
            // и всё же надо загнать файлы в текст шобы подстричь код
            if (n >= m)
                System.out.println(1);
            else if (n <= k)
                System.out.println("no");
            else
                System.out.println((m - n - 1) / (n - k) + 2);
            scanner.close();
        }
    }
//      5
    //10  = 100 000