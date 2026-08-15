# Architecture
## Overview
This document outlines the architecture of our minimal Spring Boot service with health check and welcome page endpoints.

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
* `GET /hello`: return a welcome page (new endpoint)

## Accepted Decisions
* We will use Spring Boot as our framework due to its ease of use and rapid development capabilities.
* Maven will be used as the build tool for this project.

## Constraints
* The service must have health check and welcome page endpoints that return 'OK' when the application is running properly.
