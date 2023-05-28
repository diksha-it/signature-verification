package com.signatureverification.client.main.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
@WithMockUser(username = "admin", roles = { "USER", "ADMIN", "PRE_VERIFICATION_USER" })
public class AuthControllerTest {

	private MockMvc mockMvc;

	@Test
	public void testAuthenticateUser() throws Exception {
		final BasicAuthController categoryController = new BasicAuthController();
		categoryController.basicauth();
		mockMvc = MockMvcBuilders.standaloneSetup(categoryController).build();
	}

}
