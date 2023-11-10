package layers;

import java.util.Objects;

public class DtoUser {
	final Long id;
	final String name;

	public DtoUser(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		DtoUser that = (DtoUser) o;
		return Objects.equals(id, that.id) && Objects.equals(name, that.name);
	}
}
