package io.swagger.configuration;

import io.swagger.BPDTSApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Home redirection to swagger api documentation
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/")
    public String index() {
        logger.debug("swagger-ui.html");
        return "redirect:swagger-ui.html";
    }
}
