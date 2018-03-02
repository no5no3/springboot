package net.no5no3.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.condition.RequestConditionHolder;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.servlet.Servlet;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.util.*;

@RestController
@RequestMapping(value = "/h")
@CacheConfig(cacheNames = "haha")
public class VocabularyController{
    @Autowired
    private VocaProperties vocaProperties;
    @GetMapping(value={"/vocabulary","/vo/{num}"})
    @Cacheable
    @ExceptionHandler()
    public String list(@Validated @Pattern(regexp = "[1-9]+") @PathVariable("num") @ModelAttribute("num") Integer num, @RequestParam(value = "size",required = false) Integer size, @RequestHeader("Referer") Optional<String> haha){

        return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getRequestURI() + "：" + num.toString() + "-" + size;
    }

}
