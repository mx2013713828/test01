package test;

/**
 * Created by ${yufeng} on 2017/10/20.
 * 多态 和 重载
 */
public abstract class Animal {
    public void eat(){

    }
    public abstract  void showType();

}

class Bird extends Animal{
    String color;
    public void showType(){


    }



}
class Chiken extends Bird{
    public void pricolor(){
        this.color = "red";
    }
    public void Printcolor(){
        System.out.println(this.color);
    }


}