# Cloud Native Java

## Important OSS Projects

### Eureka AWS Service registry

Service Discovery: Eureka instances can be registered and clients can discover the instances using Spring-managed beans
Service Discovery: an embedded Eureka server can be created with declarative Java configuration

### Zuul Gateway Service

Router and Filter: automatic regsitration of Zuul filters, and a simple convention over configuration approach to reverse proxy creation

### Archaius Config Service

External Configuration: a bridge from the Spring Environment to Archaius (enables native configuration of Netflix components using Spring Boot conventions)

### Ribbon IPC

Ribbon is a Inter Process Communication (remote procedure calls) library with built in software load balancers. The primary usage model involves REST calls with various serialization scheme support.

### Hystrix fault tolerant library

Circuit Breaker: Hystrix clients can be built with a simple annotation-driven method decorator

Circuit Breaker: embedded Hystrix dashboard with declarative Java configuration

## Feign

Feign makes writing java http clients easier
Declarative REST Client: Feign creates a dynamic implementation of an interface decorated with JAX-RS or Spring MVC annotations






