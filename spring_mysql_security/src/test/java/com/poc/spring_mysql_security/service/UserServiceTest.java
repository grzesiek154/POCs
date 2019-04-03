package com.poc.spring_mysql_security.service;

import com.poc.spring_mysql_security.domain.User;
import com.poc.spring_mysql_security.repository.RoleRepository;
import com.poc.spring_mysql_security.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.MockitoAnnotations.initMocks;

public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private RoleRepository roleRepository;

    @Mock
    BCryptPasswordEncoder bCryptPasswordEncoder;

    private UserService userServiceUnderTest;
    private User user;


    @Before
    public void setUp() throws Exception {

        initMocks(this);
        userServiceUnderTest = new UserService(userRepository, roleRepository, bCryptPasswordEncoder);

        user = User.builder()
                .id(1)
                .name("Jan")
                .lastName("Kowalski")
                .email("janek@test.com")
                .build();

        Mockito.when(userRepository.save(any()))
                .thenReturn(user);
        Mockito.when(userRepository.findByEmail(anyString()))
                .thenReturn(user);
    }

    @Test
    public void findUserByEmail() {

        final String email = "janek@test.com";

        final User result = userServiceUnderTest.findUserByEmail(email);

        assertEquals(email, result.getEmail());
    }

    @Test
    public void saveUser() {

        // Setup
        final String email = "test@test.com";

        // Run the test
        User result = userServiceUnderTest.saveUser(User.builder().build());

        // Verify the results
        assertEquals(email, result.getEmail());
    }
}