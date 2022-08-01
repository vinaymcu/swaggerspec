@SpringBootTest
@ExtendWith(MockitoExtension.class)
//@RunWith(JUnitPlatform.class)
public class AccountControllerTest {

    @InjectMocks
    AccountController  employeeController;

    @Test
    public void testAddEmployee()
    {
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

       // when(employeeDAO.addEmployee(any(Employee.class))).thenReturn(true);

       // Employee employee = new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
        ResponseEntity<Account02> responseEntity = employeeController.getHello();
        System.out.println(" responseEntity>>>"+responseEntity);

    }

    
    server:
  servlet:
    context-path: /myapp
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/mydb3
    driverClassName: org.postgresql.Driver
    username: postgres
    password: admin
  jpa:
    database-platform: org.hibernate.dialect.PostgreSQLDialect
    hibernate:
      #ddl-auto: create
      #generate-ddl: true
      show-sql: true
  #h2:
    #console.enabled: true
