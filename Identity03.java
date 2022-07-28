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
