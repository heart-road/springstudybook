package com.gc.action.sql_ioc;

/**
 * Created by runda on 2016/12/27.
 */
public class Buessniess {
    private DataBase db;
    public void setDb(DataBase db){
        this.db = db;
    }
    //依赖注入，通过接口注入来控制我自身要做的事情，而不是我要受到具体实现类的限制
    public void getData(){
        db.getData();
    }
}
