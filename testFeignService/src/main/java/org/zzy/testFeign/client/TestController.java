package org.zzy.testFeign.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zzy.common.api.CommonPage;
import org.zzy.common.api.Result;

@RestController
public class TestController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/test-users")
    public Result<CommonPage<UserDTO>> getAllUsers() {
        return userClient.getAllUsers();
    }
}