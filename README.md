## Dependencies
- Developer Tools
    - Spring Boot DevTools
    
- Web
    - Spring Web
    
- Template Engines
    - Thymeleaf
    
- SQL
    - Spring Data JPA
    - H2 Database


## 3rd Party Libraries 
- jQuery
- Bootstrap 4
- WebJar


## Unit Testing Tools
- JUnit 5
- Mockito
- MockMVC


## CI Integration
- Circle CI


## Notes
- @EqualsAndHashCode(exclude = {"recipes"})
    - Application throwing an error when try to override equal() and hashCode()
    - Reason is, there are Bi-Directional relationships between Entities. When executing equal() or hashCode(), it is recusing on same Primary Object.
    - We need to remove Primary Entity from equal() and hashCode()

- @Transactional
    - Create all transactions in same Transaction Context
    - Sometimes Lazy Loading Data getting fail to load in same Context
    - Therefore, we are forcing to Spring Boot to create all transactions in same Context
