package ConduitAPI;

public class LoginPayoad {

	
	private User user;

    public LoginPayoad() {}

    public LoginPayoad(User user) {
        this.user = user;
    }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
