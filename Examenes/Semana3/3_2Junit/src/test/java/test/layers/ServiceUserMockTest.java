package test.layers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import layers.DtoUser;
import layers.RepositoryUser;
import layers.ServiceUserMock;

@ExtendWith(MockitoExtension.class)
public class ServiceUserMockTest {

	@Mock
	private RepositoryUser repositoryUser;

	@InjectMocks
	private ServiceUserMock serviceUserMock;

//	@BeforeEach
//	public void setUp() {
//		// without using @Mock notation
//		// RepositoryUser mock = Mockito.mock(RepositoryUser.class);
//
//		// Without using @InjectMocks notation
//		// serviceUserMock = new ServiceUserMock(repositoryUser);
//	}
//
	@Test
	@DisplayName("Create with Mockito")
	public void createUserMock() {
		DtoUser simulatedUser = new DtoUser(1L, "Test");
		DtoUser expectedUser = new DtoUser(1L, "Test");
//		Mockito.when(repositoryUser.createUser("Test")).thenReturn(expectedUser);
		Mockito.when(repositoryUser.createUser("Test")).thenReturn(simulatedUser);
		final DtoUser testedUser = serviceUserMock.createUser("Test");
		Assertions.assertEquals(expectedUser, testedUser);
		Assertions.assertEquals(expectedUser.getId(), testedUser.getId());
		Assertions.assertEquals(expectedUser.getName(), testedUser.getName());
		Mockito.verify(repositoryUser, Mockito.times(1)).createUser("Test");
	}

	@Test
	@DisplayName("Get users with Mockito")
	public void getUserMock() {
		DtoUser simulatedUser = new DtoUser(1L, "John");
		DtoUser expectedUser = new DtoUser(1L, "John");
		Mockito.when(repositoryUser.getUser(1L)).thenReturn(simulatedUser);
		final DtoUser testedUser = serviceUserMock.getUser(1L);
		Assertions.assertEquals(expectedUser, testedUser);
		Mockito.verify(repositoryUser, Mockito.times(1)).getUser(1L);
	}

}
