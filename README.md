Port Configuration
----
1. Check if the option --port <port number> is set, if it is set, use the provided port number
2. Check if the environment variable PORT (case sensitive) is set, if it is set use the provided port number
3. If none of the above are set, default to port 3000

If port number not set in command line or environment variable (in application.properties), use port number set in Day11PracticeWorkshopApplication.java : String port = "3000".

If port number set in command line but not as environment variable, use the command line port number.

If port number set as environment variable, use the environment variable port number.


- Passing argument to SpringBoot via command line:
mvn spring-boot:run -Dspring-boot.run.arguments=“--port=3000 <space>--logLevel=TRACE”

