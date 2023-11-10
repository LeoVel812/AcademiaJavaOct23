package test.layers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import layers.DtoUser;
import layers.ServiceUser;

public class ServiceUserTest {

	private ServiceUser serviceUser;

	@BeforeEach
	public void setUp() {
		serviceUser = new ServiceUser();
		serviceUser.createUser(0L, "First User");
		serviceUser.createUser(1L, "Second User");
	}

	@Test
	@DisplayName("Create users well")
	public void createUserOk() {
		DtoUser expectedUser = new DtoUser(1L, "Test");
		final DtoUser testedUser = serviceUser.createUser(1L, "Test");
		Assertions.assertEquals(expectedUser, testedUser);
		Assertions.assertEquals(expectedUser.getId(), testedUser.getId());
		Assertions.assertEquals(expectedUser.getName(), testedUser.getName());
	}

	@Test
	@DisplayName("Create users badly")
	public void createUserWrong() {
		DtoUser expectedUser = new DtoUser(1L, "Test");
		final DtoUser testedUser = serviceUser.createUser(2L, "Name");
		Assertions.assertNotEquals(expectedUser, testedUser);
		Assertions.assertNotEquals(expectedUser.getId(), testedUser.getId());
		Assertions.assertNotEquals(expectedUser.getName(), testedUser.getName());
	}

	@Test
	@DisplayName("Get users")
	public void getUserWrong() {
		DtoUser expectedUser = new DtoUser(0L, "First User");
		final DtoUser testedUser = serviceUser.getUser(0L);
		Assertions.assertEquals(expectedUser, testedUser);
	}

}
