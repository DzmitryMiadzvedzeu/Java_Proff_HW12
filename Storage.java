package com.telran.org.homeworktwelve;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private Map<User, List<UserRequest>> data;

    public Storage() {
        this.data = new HashMap<>();
    }

    public Map<User, List<UserRequest>> getData() {
        return data;
    }

    public void setData(Map<User, List<UserRequest>> data) {
        this.data = data;
    }

    public void addUserRequest(User user, UserRequest userRequest) {
        if (!data.containsKey(user)) {
            data.put(user, new ArrayList<>());
        } else {
            data.get(user).add(userRequest);
        }
    }
}
