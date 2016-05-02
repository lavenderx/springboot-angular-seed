package com.github.lavenderx

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.util.StringUtils

/**
 * <a href="https://justinrodenbostel.com/2014/05/30/part-5-integrating-spring-security-with-spring-boot-web/"></a>
 * <a href="http://info.michael-simons.eu/2014/04/15/spring-boot-as-a-backend-for-angularjs/"></a>
 * <a href="http://blog.csdn.net/catoop/article/details/50501706"></a>
 *
 * Created by lavenderx on 2016-04-28.
 */
@ComponentScan('com.github.lavenderx.config')
@SpringBootApplication
class ApplicationBoot {

    static final String PROFILE = 'spring.profiles.active'

    static main(args) {
        if (StringUtils.isEmpty(System.getProperty(PROFILE))) {
            System.setProperty(PROFILE, 'prod')
        }

        SpringApplication.run(ApplicationBoot, args)
    }
}