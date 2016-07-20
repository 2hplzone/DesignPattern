package Delegate.adapter_class;

/**
 * Created by user on 2016-07-20.
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string){
        this.banner = new Banner(string);
    }


    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
