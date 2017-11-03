package Fri;

/**
 * Created by ${yufeng} on 2017/11/3.
 */
public class Test {
    public static void main(String[] args) {
        DBManagerproxy1 client1 = new DBManagerproxy1("ok");
        client1.setPermission("asd");
        client1.add();
        client1.delete();
        client1.view();



    }
}
