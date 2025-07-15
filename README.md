Identity Access Management (IAM) system using Java 21, Spring Boot 3.5, and the OAuth 2.0 protocol for authentication and authorization. The system will include user authentication, role-based authorization, and secure access to resources using OAuth 2.0. I’ll provide a detailed explanation of each component, the architecture, and the code to implement it. Since this is a complex task, I’ll break it down into manageable sections, ensuring clarity and completeness.

Overview of the IAM System
The IAM system will:
Authenticate users via OAuth 2.0 using an Authorization Server (e.g., Keycloak or a custom Spring Authorization Server).
Authorize users based on roles (e.g., ADMIN, USER) to access protected resources.
Use Spring Security to integrate OAuth 2.0 for securing APIs.
Include a Resource Server to serve protected resources.
Store user data in a database (e.g., PostgreSQL) and manage roles/permissions.
Support JWT (JSON Web Tokens) for secure token-based authentication.

Architecture
Authorization Server: Issues OAuth 2.0 access tokens and refresh tokens. We’ll use Spring Authorization Server for simplicity, but you could integrate Keycloak or Auth0 in production.
Resource Server: A Spring Boot application hosting protected APIs, validating access tokens.
Client Application: A consumer of the APIs (could be a frontend or another service) that requests tokens from the Authorization Server.
Database: Stores user credentials, roles, and OAuth client details.
OAuth 2.0 Flow: We’ll implement the Authorization Code Grant flow, suitable for web applications, with JWT as the token format.
Prerequisites
Java 21 (LTS version, ensuring modern features like records and sealed classes).
Spring Boot 3.5 (latest stable version, compatible with Spring Security and Authorization Server).
PostgreSQL (or any relational database for user and client storage).
Maven (for dependency management).
Basic understanding of OAuth 2.0 concepts (e.g., access tokens, refresh tokens, scopes).

Step-by-Step Implementation
Project Setup
Create a Spring Boot project using Spring Initializr with the following dependencies:
Spring Web: For REST APIs.
Spring Security: For authentication and authorization.
Spring Authorization Server: For OAuth 2.0 server.
Spring Data JPA: For database operations.
PostgreSQL Driver: For database connectivity.
Lombok: To reduce boilerplate code.
Spring Boot Starter OAuth2 Client: For resource server and client functionality.
