package Fileload;

/**
 * Created by ${yufeng} on 2017/10/27.
 */
public class Media extends Document{
    private String type;
    public Media(String s) {
        this.type = s;
    }

    @Override
    void open() {
        System.out.println("type: "+type+" is opened.");

    }
}
