package Fri;

/**
 * Created by ${yufeng} on 2017/11/3.
 * public static void main(String args[])
 * {
 *     int a=9;
 *     for(int i=0;i<9;i++)
 *     {
 *         ff
 *     }
 * }
 */
public class DBManager implements IDBAction{


    public DBManager() {
    }

    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");

    }

    @Override
    public void view() {
        System.out.println("view");

    }
}
