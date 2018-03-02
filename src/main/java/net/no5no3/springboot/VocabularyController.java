package net.no5no3.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.validation.constraints.Pattern;
import java.util.Optional;

@RestController
@RequestMapping(value = "/h")
//@CacheConfig(cacheNames = "haha")
public class VocabularyController{
    @Autowired
    private VocaProperties vocaProperties;
    @GetMapping(value={"/vocabulary","/vo/{num}"})
//    @Cacheable
    @ExceptionHandler()
    public String list(@Validated @Pattern(regexp = "[1-9]+") @PathVariable("num") @ModelAttribute("num") Integer num, @RequestParam(value = "size",required = false) Integer size, @RequestHeader("Referer") Optional<String> haha){

        return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getRequestURI() + "：" + num.toString() + "-" + size;
    }

}
