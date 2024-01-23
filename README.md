Repro project for [Dolt #7384](https://github.com/dolthub/dolt/issues/7384)

To run this project, first start up a `dolt sql-server`:
- `mkdir jan23 && cd jan23`
- `dolt init --fun`
- `dolt sql-server --port 11229 --loglevel DEBUG`

Then run the Maven project:
- `mvn install exec:java -Dexec.mainClass="org.example.Main"`
