package com.gc.action.sql_ioc;

/**
 * Created by runda on 2016/12/27.
 */
public class SqlDataBase implements DataBase {
    public String getData() {
        return "你正在从SQLServerDataBase拿数据";
    }
}
