# Architecture
## Overview
This document outlines the architecture of our minimal Spring Boot service with health check, welcome page, date endpoints, and goodbye message endpoint.

## Framework
Spring Boot 2.x

## Build Tool
Maven

## Dependencies
* `spring-boot-starter-web` for web support
* `spring-boot-starter-actuator` for health check endpoint

## Java Version
Java 11 or later

## Endpoints
### Health Check
* `GET /health`: returns a simple health check response indicating whether the application is running properly.

### Welcome Page
* `GET /hello`: return a welcome page

### Date Endpoint
* `GET /date`: returns the current date in a specified format (e.g. `YYYY-MM-DD`).

### Bye Endpoint
* `GET /bye`: returns a personalized goodbye message, e.g. 'Goodbye my love'

### Hello2 Endpoint
* `GET /hello2`: returns hello world text

### Hello3 Endpoint
* `GET /hello3`: returns "Hi hi hi" text

### Hello4 Endpoint
* `GET /hello4`: returns "Hi hi hi hi" text

## Accepted Decisions
* We will use Spring Boot as our framework due to its ease of use and rapid development capabilities.
* Maven will be used as the build tool for this project.

## Constraints
* The service must have health check, welcome page, date endpoints that return 'OK' when the application is running properly.
