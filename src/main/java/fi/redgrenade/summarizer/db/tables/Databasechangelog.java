/*
 * This file is generated by jOOQ.
*/
package fi.redgrenade.summarizer.db.tables;


import fi.redgrenade.summarizer.db.Public;
import fi.redgrenade.summarizer.db.tables.records.DatabasechangelogRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Databasechangelog extends TableImpl<DatabasechangelogRecord> {

    private static final long serialVersionUID = 97610528;

    /**
     * The reference instance of <code>public.databasechangelog</code>
     */
    public static final Databasechangelog DATABASECHANGELOG = new Databasechangelog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatabasechangelogRecord> getRecordType() {
        return DatabasechangelogRecord.class;
    }

    /**
     * The column <code>public.databasechangelog.id</code>.
     */
    public final TableField<DatabasechangelogRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>public.databasechangelog.author</code>.
     */
    public final TableField<DatabasechangelogRecord, String> AUTHOR = createField("author", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>public.databasechangelog.filename</code>.
     */
    public final TableField<DatabasechangelogRecord, String> FILENAME = createField("filename", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>public.databasechangelog.dateexecuted</code>.
     */
    public final TableField<DatabasechangelogRecord, Timestamp> DATEEXECUTED = createField("dateexecuted", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.databasechangelog.orderexecuted</code>.
     */
    public final TableField<DatabasechangelogRecord, Integer> ORDEREXECUTED = createField("orderexecuted", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.databasechangelog.exectype</code>.
     */
    public final TableField<DatabasechangelogRecord, String> EXECTYPE = createField("exectype", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>public.databasechangelog.md5sum</code>.
     */
    public final TableField<DatabasechangelogRecord, String> MD5SUM = createField("md5sum", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

    /**
     * The column <code>public.databasechangelog.description</code>.
     */
    public final TableField<DatabasechangelogRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.databasechangelog.comments</code>.
     */
    public final TableField<DatabasechangelogRecord, String> COMMENTS = createField("comments", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.databasechangelog.tag</code>.
     */
    public final TableField<DatabasechangelogRecord, String> TAG = createField("tag", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.databasechangelog.liquibase</code>.
     */
    public final TableField<DatabasechangelogRecord, String> LIQUIBASE = createField("liquibase", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>public.databasechangelog.contexts</code>.
     */
    public final TableField<DatabasechangelogRecord, String> CONTEXTS = createField("contexts", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.databasechangelog.labels</code>.
     */
    public final TableField<DatabasechangelogRecord, String> LABELS = createField("labels", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.databasechangelog.deployment_id</code>.
     */
    public final TableField<DatabasechangelogRecord, String> DEPLOYMENT_ID = createField("deployment_id", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

    /**
     * Create a <code>public.databasechangelog</code> table reference
     */
    public Databasechangelog() {
        this("databasechangelog", null);
    }

    /**
     * Create an aliased <code>public.databasechangelog</code> table reference
     */
    public Databasechangelog(String alias) {
        this(alias, DATABASECHANGELOG);
    }

    private Databasechangelog(String alias, Table<DatabasechangelogRecord> aliased) {
        this(alias, aliased, null);
    }

    private Databasechangelog(String alias, Table<DatabasechangelogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Databasechangelog as(String alias) {
        return new Databasechangelog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Databasechangelog rename(String name) {
        return new Databasechangelog(name, null);
    }
}
