/*
 * This file is generated by jOOQ.
*/
package fi.redgrenade.summarizer.db.tables.daos;


import fi.redgrenade.summarizer.db.tables.Databasechangeloglock;
import fi.redgrenade.summarizer.db.tables.records.DatabasechangeloglockRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class DatabasechangeloglockDao extends DAOImpl<DatabasechangeloglockRecord, fi.redgrenade.summarizer.db.tables.pojos.Databasechangeloglock, Integer> {

    /**
     * Create a new DatabasechangeloglockDao without any configuration
     */
    public DatabasechangeloglockDao() {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK, fi.redgrenade.summarizer.db.tables.pojos.Databasechangeloglock.class);
    }

    /**
     * Create a new DatabasechangeloglockDao with an attached configuration
     */
    public DatabasechangeloglockDao(Configuration configuration) {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK, fi.redgrenade.summarizer.db.tables.pojos.Databasechangeloglock.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(fi.redgrenade.summarizer.db.tables.pojos.Databasechangeloglock object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<fi.redgrenade.summarizer.db.tables.pojos.Databasechangeloglock> fetchById(Integer... values) {
        return fetch(Databasechangeloglock.DATABASECHANGELOGLOCK.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public fi.redgrenade.summarizer.db.tables.pojos.Databasechangeloglock fetchOneById(Integer value) {
        return fetchOne(Databasechangeloglock.DATABASECHANGELOGLOCK.ID, value);
    }

    /**
     * Fetch records that have <code>locked IN (values)</code>
     */
    public List<fi.redgrenade.summarizer.db.tables.pojos.Databasechangeloglock> fetchByLocked(Boolean... values) {
        return fetch(Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKED, values);
    }

    /**
     * Fetch records that have <code>lockgranted IN (values)</code>
     */
    public List<fi.redgrenade.summarizer.db.tables.pojos.Databasechangeloglock> fetchByLockgranted(Timestamp... values) {
        return fetch(Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKGRANTED, values);
    }

    /**
     * Fetch records that have <code>lockedby IN (values)</code>
     */
    public List<fi.redgrenade.summarizer.db.tables.pojos.Databasechangeloglock> fetchByLockedby(String... values) {
        return fetch(Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKEDBY, values);
    }
}
