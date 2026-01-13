package org.zzy.testFeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.zzy.common.api.CommonPage;
import org.zzy.common.api.Result;

@FeignClient(name = "zpring-service")
public interface UserClient {

    @GetMapping("/users")
    Result<CommonPage<UserDTO>> getAllUsers();
}