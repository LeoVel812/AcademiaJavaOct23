package layers;

public interface RepositoryUser {
	DtoUser createUser(String name);

	DtoUser getUser(Long id);
}
