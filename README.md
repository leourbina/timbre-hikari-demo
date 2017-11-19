# timbre-hikari-demo

Testing timbre with hikari and slf4-timbre to make sure that it works
as expected.

## Testing

Run

```sh
$ lein postgres run <log-level>
```

The output looks like this

Info level

  ```sh
  $ lein postgres run debug
  ... // embedded postgres starting
  17-11-18 23:55:44 Leos-MacBook-Air.local INFO [com.zaxxer.hikari.HikariDataSource:71] - demo-pool - Starting...
  17-11-18 23:55:44 Leos-MacBook-Air.local INFO [com.zaxxer.hikari.pool.PoolBase:526] - demo-pool - Driver does not support get/set network timeout for connections. (Method org.postgresql.jdbc.PgConnection.getNetworkTimeout() is not yet implemented.)
  17-11-18 23:55:44 Leos-MacBook-Air.local INFO [com.zaxxer.hikari.HikariDataSource:73] - demo-pool - Start completed.
  17-11-18 23:55:50 Leos-MacBook-Air.local INFO [timbre-hikari-demo.core:33] - This is visible
  ... // embedded postgres stopping
  ```

Debug level
```sh
... // embedded postgres starting
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1053] - demo-pool - configuration:
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - allowPoolSuspension.............false
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - autoCommit......................true
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - catalog.........................none
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - connectionInitSql...............none
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - connectionTestQuery.............none
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - connectionTimeout...............30000
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - dataSource......................none
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - dataSourceClassName............."org.postgresql.ds.PGSimpleDataSource"
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - dataSourceJNDI..................none
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - dataSourceProperties............{password=<masked>, portNumber=12345, databaseName=postgres, serverName=localhost}
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - driverClassName.................none
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - healthCheckProperties...........{}
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - healthCheckRegistry.............none
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - idleTimeout.....................600000
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - initializationFailFast..........true
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - initializationFailTimeout.......1
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - isolateInternalQueries..........false
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - jdbc4ConnectionTest.............false
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - jdbcUrl.........................none
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - leakDetectionThreshold..........0
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - maxLifetime.....................1800000
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - maximumPoolSize.................10
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - metricRegistry..................none
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - metricsTrackerFactory...........none
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - minimumIdle.....................10
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - password........................<masked>
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - poolName........................"demo-pool"
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - readOnly........................false
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - registerMbeans..................false
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - scheduledExecutor...............none
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - scheduledExecutorService........internal
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - schema..........................none
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - threadFactory...................internal
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - transactionIsolation............default
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - username........................"postgres"
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.HikariConfig:1085] - validationTimeout...............5000
17-11-19 00:03:57 Leos-MacBook-Air.local INFO [com.zaxxer.hikari.HikariDataSource:71] - demo-pool - Starting...
17-11-19 00:03:57 Leos-MacBook-Air.local INFO [com.zaxxer.hikari.pool.PoolBase:526] - demo-pool - Driver does not support get/set network timeout for connections. (Method org.postgresql.jdbc.PgConnection.getNetworkTimeout() is not yet implemented.)
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.pool.HikariPool:537] - demo-pool - Added connection org.postgresql.jdbc.PgConnection@782ed745
17-11-19 00:03:57 Leos-MacBook-Air.local INFO [com.zaxxer.hikari.HikariDataSource:73] - demo-pool - Start completed.
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.pool.HikariPool:403] - demo-pool - Pool stats (total=1, active=0, idle=1, waiting=0)
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.pool.HikariPool:699] - demo-pool - Added connection org.postgresql.jdbc.PgConnection@1249020e
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.pool.HikariPool:699] - demo-pool - Added connection org.postgresql.jdbc.PgConnection@3d9c0b43
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.pool.HikariPool:699] - demo-pool - Added connection org.postgresql.jdbc.PgConnection@776c0242
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.pool.HikariPool:699] - demo-pool - Added connection org.postgresql.jdbc.PgConnection@67a0c4af
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.pool.HikariPool:699] - demo-pool - Added connection org.postgresql.jdbc.PgConnection@1483dc1a
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.pool.HikariPool:699] - demo-pool - Added connection org.postgresql.jdbc.PgConnection@764ed450
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.pool.HikariPool:699] - demo-pool - Added connection org.postgresql.jdbc.PgConnection@52e1a45c
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.pool.HikariPool:699] - demo-pool - Added connection org.postgresql.jdbc.PgConnection@798511fc
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.pool.HikariPool:699] - demo-pool - Added connection org.postgresql.jdbc.PgConnection@25abd85
17-11-19 00:03:57 Leos-MacBook-Air.local DEBUG [com.zaxxer.hikari.pool.HikariPool:403] - demo-pool - After adding stats (total=10, active=0, idle=10, waiting=0)
17-11-19 00:04:02 Leos-MacBook-Air.local DEBUG [timbre-hikari-demo.core:31] - This is hidden
17-11-19 00:04:03 Leos-MacBook-Air.local INFO [timbre-hikari-demo.core:33] - This is visible
... // embedded postgres stopping
```

Namely, it works as expected.
