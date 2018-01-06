package cn.et;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("EUREKAMAIL")
public interface IsendMail {
	@GetMapping("/user/{userid}")
    public Map<String, String> getuser(@PathVariable("userid") String userid);
	@PostMapping("/sendMail")
	public String sendMail(@RequestBody Map<String,Object> map);
}
