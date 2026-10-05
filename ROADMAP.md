# Shop API — Backend learning roadmap

Based on https://roadmap.sh/backend. Stack: Java + Spring Boot + PostgreSQL + Maven.

## Progress

- [x] 0. Internet basics — HTTP, DNS, domain, hosting, how browsers work
- [ ] 1. Java Core — syntax, OOP, collections, exceptions, generics, streams
- [ ] 2. Git + GitHub — commit, branch, PR
- [ ] 3. SQL + PostgreSQL — tables, JOIN, indexes, normalization, ACID, transactions
- [ ] 4. Spring Boot REST API — REST, JSON, CRUD, validation, error handling
- [ ] 5. ORM — JPA/Hibernate, N+1, Flyway migrations
- [ ] 6. Auth + security — Spring Security, JWT, password hashing, CORS, OWASP
- [ ] 7. Testing — JUnit, Mockito, Testcontainers
- [ ] 8. Caching — Redis
- [ ] 9. Docker + CI/CD — Dockerfile, docker-compose, GitHub Actions
- [ ] 10. Advanced — RabbitMQ/Kafka, architecture patterns, scaling, observability
- [ ] 11. Deploy

## Notes

<!-- Short takeaways per stage go here -->

### Stage 0 — Internet basics
- DNS returns only an IP, never a port. The port comes from the scheme (`http` → 80, `https` → 443) or is written explicitly.
- Request path: DNS → TCP to `IP:443` → TLS → HTTP → nginx (reverse proxy, TLS termination) → `localhost:8080` (Spring Boot).
- 401 = not authenticated (who are you?), 403 = authenticated but not authorized (not allowed).
- Idempotent: repeating gives the same result. `PUT`/`DELETE` are idempotent, `POST` is not (retry → duplicate order).
- CORS is enforced by the browser, configured by the backend. Postman/curl never hit CORS.
- HTTP is stateless: state is carried via session cookie or token (JWT).
