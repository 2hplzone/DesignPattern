package Delegate.adapter_interface;

/**
 * Created by user on 2016-07-20.
 */
public class Banner {
    private String string;
    public Banner(String string){
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("("+string+")");
    }

    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
