package newpackages;

public class FriendshipAgeCriteria<T extends Comparable<T>, S extends Comparable<S>> {
	private T Friendname;
	private S age;

	public FriendshipAgeCriteria(T name, S currentage) {
		this.Friendname = name;
		this.age = currentage;
	}

	public T getName() {
		return Friendname;
	}

	public void setName(T name) {
		this.Friendname = name;
	}

	public S getage() {
		return age;
	}

	public void setage(S Currentage) {
		this.age = Currentage;
	}
}


