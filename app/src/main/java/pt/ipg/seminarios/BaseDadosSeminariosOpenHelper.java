package pt.ipg.seminarios;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BaseDadosSeminariosOpenHelper extends SQLiteOpenHelper {

    public static final String NOME_BASE_DADOS = "seminarios.db";

    public BaseDadosSeminariosOpenHelper(@Nullable Context context) {
        super(context, NOME_BASE_DADOS, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
