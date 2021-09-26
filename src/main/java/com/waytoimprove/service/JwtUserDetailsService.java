package com.waytoimprove.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService  implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        if("waytoimprove".equals(userName)){
            return new User("waytoimprove","$2a$10$TkdYh2K1hYJVKR9JCb5raO7dNfsX6AmIIHvWZ/HhCwgtC1JPmYwfi", new ArrayList<>());
        }else{
            throw new UsernameNotFoundException("User not found with username: " + userName);
        }
    }
}
