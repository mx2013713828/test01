package Fileload;

/**
 * Created by ${yufeng} on 2017/10/27.
 */
public class Text extends Document {
//    private String type;
    public Text(String s) {
        this.type = s;
    }

    public Text() {
    }

    @Override
    void open() {
        System.out.println("type: "+type+" is opened.");

    }
}
