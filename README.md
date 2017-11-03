# Spring Session Redis Demo &nbsp; [![Tweet](https://img.shields.io/twitter/url/http/shields.io.svg?style=social)](https://twitter.com/intent/tweet?text=Spring%20Session%20With%20Redis&url=https://github.com/selzlein/spring-session-redis-demo&hashtags=spring,spring-session,redis)

Externalize session information to Redis using Spring projects

- Spring Data Redis
- Spring Session
- Spring Security

## What for?

When working on a multi-instance web application, application state must be all externalized from the web servers. Users' session information are by default stored in-memory by the web servers, such as Wildfly or Apache Tomcat.

In order to resolve this matter the architecture demo implemented here stores session information on [Redis](https://redis.io/) (follow the link for more information) so when a web server is down others have access to the sessions this server was handling requests from.

See [this blog post](https://selzlein.github.io/2017/10/30/spring-security-session-redis/) for further information.

## Setup

Before running this demo, make sure you have Redis running.
You may either install it or run its [Docker image](https://hub.docker.com/_/redis/).

Default Redis host and port:
 
    127.0.0.1:6379

## Run

- Clone
- Run SpringSessionRedisDemoApplication.java

## Play

- Access *http://localhost:8080*
- Log in as *admin/admin*
- Restart your server
- Refresh your browser
- Keep using your session from where you left it