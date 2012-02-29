package org.grajagan.map;

import java.util.Date;
import java.math.BigDecimal;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.DatabaseMap;
import org.apache.torque.map.TableMap;
import org.apache.torque.map.ColumnMap;
import org.apache.torque.map.InheritanceMap;

/**
  *  This class was autogenerated by Torque on:
  *
  * [Tue Feb 28 18:28:16 PST 2012]
  *
  */
public class Tbl1MapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.grajagan.map.Tbl1MapBuilder";

    /**
     * The database map.
     */
    private DatabaseMap dbMap = null;

    /**
     * Tells us if this DatabaseMapBuilder is built so that we
     * don't have to re-build it every time.
     *
     * @return true if this DatabaseMapBuilder is built
     */
    public boolean isBuilt()
    {
        return (dbMap != null);
    }

    /**
     * Gets the databasemap this map builder built.
     *
     * @return the databasemap
     */
    public DatabaseMap getDatabaseMap()
    {
        return this.dbMap;
    }

    /**
     * The doBuild() method builds the DatabaseMap
     *
     * @throws TorqueException
     */
    public synchronized void doBuild() throws TorqueException
    {
        if ( isBuilt() ) {
            return;
        }
        dbMap = Torque.getDatabaseMap("mydb");

        dbMap.addTable("tbl1");
        TableMap tMap = dbMap.getTable("tbl1");
        tMap.setJavaName("Tbl1");
        tMap.setOMClass( org.grajagan.Tbl1.class );
        tMap.setPeerClass( org.grajagan.Tbl1Peer.class );
        tMap.setPrimaryKeyMethod(TableMap.NATIVE);
        tMap.setPrimaryKeyMethodInfo("tbl1");

        ColumnMap cMap = null;


    // ------------- Column: tbl1_id --------------------
        cMap = new ColumnMap( "tbl1_id", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(true);
        cMap.setNotNull(true);
        cMap.setJavaName( "Tbl1Id" );
        cMap.setAutoIncrement(true);
        cMap.setProtected(false);
                cMap.setInheritance("false");
                    cMap.setPosition(1);
          tMap.addColumn(cMap);
    // ------------- Column: name --------------------
        cMap = new ColumnMap( "name", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "Name" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
                cMap.setInheritance("false");
                cMap.setSize( 64 );
                  cMap.setPosition(2);
          tMap.addColumn(cMap);
        tMap.setUseInheritance(false);
    }
}
