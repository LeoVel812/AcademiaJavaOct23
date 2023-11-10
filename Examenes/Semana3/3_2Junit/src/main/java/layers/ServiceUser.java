package layers;

import java.util.HashMap;

public class ServiceUser {
	private final HashMap<Long, DtoUser> users = new HashMap<>();

	public DtoUser createUser(Long id, String name) {
		users.put(id, new DtoUser(id, name));
		return users.get(id);
	}

	public DtoUser getUser(Long id) {
		return users.get(id);
	}

	public DtoUser updateUser(Long id, String name) {
		return users.put(id, new DtoUser(id, name));
	}
}
