package hw.hw0;

import java.util.Scanner;

public class drawTriangle {
    public static void drawTriangle(int N) {
        if(N < 1) return ;

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
            //System.out.print('\n');
        }
    }

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入要打印的三角形边长度：");
        int N = scanner.nextInt();

        drawTriangle(N);
    }
}
