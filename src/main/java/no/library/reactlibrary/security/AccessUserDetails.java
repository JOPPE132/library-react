package no.library.reactlibrary.security;

import jakarta.persistence.Access;
import no.library.reactlibrary.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class AccessUserDetails implements UserDetails {

    private String username;

    private String password;

    private String role;

    private Set<GrantedAuthority> authorities = new HashSet<>();

    public AccessUserDetails(User user){
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.role = user.getRole();
    }

    public AccessUserDetails(){
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    public String getRole(){
        return this.role;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
