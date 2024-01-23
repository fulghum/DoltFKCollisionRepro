Repro project for [Dolt #7384](https://github.com/dolthub/dolt/issues/7384)

To run this project, first start up a `dolt sql-server`:
- `mkdir jan23 && cd jan23`
- `dolt init --fun`
- `dolt sql-server --port 11229 --loglevel DEBUG`

Then run the Maven project:
- `mvn install exec:java -Dexec.mainClass="org.example.Main"`

If running the project doesn't produce any errors/exceptions, then everything executed successfully and the 
project was NOT able to reproduce the foreign key name error. If you see a SQLException that says the foreign
key name already exists, then it means the project did repro the error.  