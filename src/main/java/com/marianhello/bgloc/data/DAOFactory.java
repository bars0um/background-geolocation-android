package com.marianhello.bgloc.data;

import android.content.Context;



import com.marianhello.bgloc.data.sqlite.SQLiteConfigurationDAO;

public abstract class DAOFactory {
    

    public static ConfigurationDAO createConfigurationDAO(Context context) {
        return new SQLiteConfigurationDAO(context);
    }
}
