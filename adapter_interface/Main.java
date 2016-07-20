package Delegate.adapter_interface;

/**
 * Created by user on 2016-07-20.
 */
public class Main {
    public static void main(String[] args){
        Print p  = new PrintBanner("Hello");
        p.printWeek();
        p.printStrong();
    }
}
