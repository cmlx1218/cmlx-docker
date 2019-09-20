package com.cmlx.docker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc 测试idea一键远程部署Docker
 * @Author cmlx
 * @Date 2019-8-16 0016 10:04
 */

@RestController
@Slf4j
public class DockerController {

    @RequestMapping("docker")
    public String testDocker() {
        log.info("Hello Docker!");
        return "恭喜你，idea远程部署docker成功！";
    }

}
