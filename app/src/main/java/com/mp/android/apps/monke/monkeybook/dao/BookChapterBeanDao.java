package com.mp.android.apps.monke.monkeybook.dao;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

import com.mp.android.apps.monke.readActivity.bean.BookChapterBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK_CHAPTER_BEAN".
*/
public class BookChapterBeanDao extends AbstractDao<BookChapterBean, String> {

    public static final String TABLENAME = "BOOK_CHAPTER_BEAN";

    /**
     * Properties of entity BookChapterBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, String.class, "id", true, "ID");
        public final static Property Link = new Property(1, String.class, "link", false, "LINK");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property TaskName = new Property(3, String.class, "taskName", false, "TASK_NAME");
        public final static Property Unreadble = new Property(4, boolean.class, "unreadble", false, "UNREADBLE");
        public final static Property BookId = new Property(5, String.class, "bookId", false, "BOOK_ID");
        public final static Property Start = new Property(6, long.class, "start", false, "START");
        public final static Property End = new Property(7, long.class, "end", false, "END");
        public final static Property Position = new Property(8, long.class, "position", false, "POSITION");
    }

    private Query<BookChapterBean> collBookBean_BookChapterListQuery;

    public BookChapterBeanDao(DaoConfig config) {
        super(config);
    }
    
    public BookChapterBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK_CHAPTER_BEAN\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: id
                "\"LINK\" TEXT," + // 1: link
                "\"TITLE\" TEXT," + // 2: title
                "\"TASK_NAME\" TEXT," + // 3: taskName
                "\"UNREADBLE\" INTEGER NOT NULL ," + // 4: unreadble
                "\"BOOK_ID\" TEXT," + // 5: bookId
                "\"START\" INTEGER NOT NULL ," + // 6: start
                "\"END\" INTEGER NOT NULL ," + // 7: end
                "\"POSITION\" INTEGER NOT NULL );"); // 8: position
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_BOOK_CHAPTER_BEAN_BOOK_ID ON \"BOOK_CHAPTER_BEAN\"" +
                " (\"BOOK_ID\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK_CHAPTER_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BookChapterBean entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
 
        String link = entity.getLink();
        if (link != null) {
            stmt.bindString(2, link);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String taskName = entity.getTaskName();
        if (taskName != null) {
            stmt.bindString(4, taskName);
        }
        stmt.bindLong(5, entity.getUnreadble() ? 1L: 0L);
 
        String bookId = entity.getBookId();
        if (bookId != null) {
            stmt.bindString(6, bookId);
        }
        stmt.bindLong(7, entity.getStart());
        stmt.bindLong(8, entity.getEnd());
        stmt.bindLong(9, entity.getPosition());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BookChapterBean entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
 
        String link = entity.getLink();
        if (link != null) {
            stmt.bindString(2, link);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String taskName = entity.getTaskName();
        if (taskName != null) {
            stmt.bindString(4, taskName);
        }
        stmt.bindLong(5, entity.getUnreadble() ? 1L: 0L);
 
        String bookId = entity.getBookId();
        if (bookId != null) {
            stmt.bindString(6, bookId);
        }
        stmt.bindLong(7, entity.getStart());
        stmt.bindLong(8, entity.getEnd());
        stmt.bindLong(9, entity.getPosition());
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public BookChapterBean readEntity(Cursor cursor, int offset) {
        BookChapterBean entity = new BookChapterBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // link
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // taskName
            cursor.getShort(offset + 4) != 0, // unreadble
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // bookId
            cursor.getLong(offset + 6), // start
            cursor.getLong(offset + 7), // end
            cursor.getLong(offset + 8) // position
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BookChapterBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setLink(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTaskName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUnreadble(cursor.getShort(offset + 4) != 0);
        entity.setBookId(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setStart(cursor.getLong(offset + 6));
        entity.setEnd(cursor.getLong(offset + 7));
        entity.setPosition(cursor.getLong(offset + 8));
     }
    
    @Override
    protected final String updateKeyAfterInsert(BookChapterBean entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public String getKey(BookChapterBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BookChapterBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "bookChapterList" to-many relationship of CollBookBean. */
    public List<BookChapterBean> _queryCollBookBean_BookChapterList(String bookId) {
        synchronized (this) {
            if (collBookBean_BookChapterListQuery == null) {
                QueryBuilder<BookChapterBean> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.BookId.eq(null));
                collBookBean_BookChapterListQuery = queryBuilder.build();
            }
        }
        Query<BookChapterBean> query = collBookBean_BookChapterListQuery.forCurrentThread();
        query.setParameter(0, bookId);
        return query.list();
    }

}
