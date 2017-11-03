package Fri;

/**
 * Created by ${yufeng} on 2017/11/3.
 */
public class DBManagerProxy extends DBManager {
    private String permission;

    public DBManagerProxy(String permission) {
        this.permission = permission;
    }

    String getPermission(String s){
        permission = s;
        return permission;
    }

    @Override
    public void add() {
        if(permission=="ok")
        super.add();
    }

    @Override
    public void delete() {
        if(permission=="ok")
        super.delete();
    }

    @Override
    public void view() {
        if(permission=="ok")
        super.view();
    }
}
