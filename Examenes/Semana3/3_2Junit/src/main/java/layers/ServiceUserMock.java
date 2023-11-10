package layers;

public class ServiceUserMock {
	private final RepositoryUser repositoryUser;

	public ServiceUserMock(final RepositoryUser repositoryUser) {
		this.repositoryUser = repositoryUser;
	}

	public DtoUser createUser(String name) {
		if (name == null) {
			throw new IllegalArgumentException("Name field can't be null");
		}
		return repositoryUser.createUser(name);
	}

	public DtoUser getUser(Long id) {
		return repositoryUser.getUser(id);
	}

}
