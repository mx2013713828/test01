package Fri;

/**
 * Created by ${yufeng} on 2017/11/3.
 */
public class DBManagerproxy1 implements IDBAction {
    private DBManager manager;
    private String permission;
    public DBManagerproxy1(String permission) {
        manager = new DBManager();
        this.permission = permission;
    }
    void setPermission(String s){
        permission=s;
    }
    /*
    private DBManager manager #类聚合 一个类中定义另一个类对象
    构造函数中 实例化DBManager
    setPermission 来设置permission值
    * */


    @Override
    public void add() {
        if (permission == "ok")
//            只需要实现DBManager中的方法
        manager.add();
    }

    @Override
    public void delete() {

    }

    @Override
    public void view() {

    }
}
