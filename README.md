# oauth-authorization-server

Spring boot Oauth authorization server

Required to be started, so client application  https://github.com/gmatysik/scheduler-client and resource server: It is being used by client application: https://github.com/gmatysik/scheduler-client and uses oAuth server to authorize access: https://github.com/gmatysik/oauth-authorization-server could work

# Build

mvn clean build

# Run

java -jar -Dspring.profiles.active=development target/server-1.0-SNAPSHOT.jar

