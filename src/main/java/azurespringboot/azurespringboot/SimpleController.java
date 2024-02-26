package azurespringboot.azurespringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@GetMapping()
	public String msg() {
		return"this springboot for azuredevops";
	}

}
