package Posttest6;

/**
 *
 * @author arput
 */
public final class admin implements akun {
    private String username, password;
    
    @Override
    public void admin() {
        username = "Admin";
        password = "admin";
    }

    @Override
    public String getUsername() {
    return username;

    }

    @Override
    public String getPassword() {
    return password;
    }
    
}
