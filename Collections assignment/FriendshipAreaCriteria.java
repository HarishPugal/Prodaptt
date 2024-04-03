package newpackages;

public class FriendshipAreaCriteria<T extends Comparable<T>, S extends Comparable<S>> {
	private T Friendname;
	private S place;
 
	public FriendshipAreaCriteria(T name, S area) {
		this.Friendname = name;
		this.place = area;
	}
 
	public T getName() {
		return Friendname;
	}
 
	public void setName(T name) {
		this.Friendname = name;
	}
 
	public S getAttribute() {
		return place;
	}
 
	public void setAttribute(S area) {
		this.place = area;
	}
}