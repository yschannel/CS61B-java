package demo.ch2.sumArgs;

public class sumArgs {
    public static void main(String[] args){
        int sum = 0;
        int i = 0;

        while(i < args.length){
            sum += Integer.parseInt(args[i]);
            i++;
        }

        System.out.println(sum);
    }
}
