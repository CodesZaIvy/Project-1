package com.art.auth;

import com.art.parties.entity.User;

import java.util.HashMap;
    import java.util.Map;
    
    public class UserDatabase {
        private static Map<String, User> users = new HashMap<>();
    
        // Simulating a basic in-memory user database
        static {
            users.put("Ivy", new User("Kwako", "76543"));
            users.put("user2", new User("user2", "password2"));
            // Add more users as needed
        }
    
        public static User getUser(String username) {
            return users.get(username);
        }
    
        public static boolean addUser(String username, String password) {
            if (getUser(username) == null) {
                users.put(username, new User(username, password));
                return true;
            }
            return false; // Username already exists
        }
    
        public static boolean removeUser(String username) {
            if (getUser(username) != null) {
                users.remove(username);
                return true;
            }
            return false; // Username not found
        }
    
        public static Map<String, User> getAllUsers() {
            return users;
        }
    }
    

