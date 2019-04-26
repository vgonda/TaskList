package com.victoriagonda.android.tasklist.persistance;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.victoriagonda.android.tasklist.Tasklist;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public final class TasklistDao_Impl implements TasklistDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTasklist;

  public TasklistDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTasklist = new EntityInsertionAdapter<Tasklist>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Tasklist`(`name`,`items`,`id`) VALUES (?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Tasklist value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        final String _tmp;
        _tmp = StringListConverter.stringListToString(value.getItems());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        stmt.bindLong(3, value.getId());
      }
    };
  }

  @Override
  public void save(final Tasklist... tasklist) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfTasklist.insert(tasklist);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Tasklist>> getAll() {
    final String _sql = "SELECT * FROM tasklist";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"tasklist"}, new Callable<List<Tasklist>>() {
      @Override
      public List<Tasklist> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfItems = CursorUtil.getColumnIndexOrThrow(_cursor, "items");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<Tasklist> _result = new ArrayList<Tasklist>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Tasklist _item;
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final List<String> _tmpItems;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfItems);
            _tmpItems = StringListConverter.stringTostringList(_tmp);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item = new Tasklist(_tmpName,_tmpItems,_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Tasklist> findById(final int id) {
    final String _sql = "SELECT * FROM tasklist WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"tasklist"}, new Callable<Tasklist>() {
      @Override
      public Tasklist call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfItems = CursorUtil.getColumnIndexOrThrow(_cursor, "items");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final Tasklist _result;
          if(_cursor.moveToFirst()) {
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final List<String> _tmpItems;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfItems);
            _tmpItems = StringListConverter.stringTostringList(_tmp);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _result = new Tasklist(_tmpName,_tmpItems,_tmpId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
