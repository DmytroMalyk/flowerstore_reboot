package ua.edu.ucu.apps.demo.flowerStore.controller;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import ua.edu.ucu.apps.demo.flowerStore.model.AppUser;
import ua.edu.ucu.apps.demo.flowerStore.service.AppUserService;

@RestController
@RequestMapping("/api/appusers")
public class AppUserController {

    
	private final AppUserService appUserService;

	@Autowired
	public AppUserController(AppUserService appUserService) {
		this.appUserService = appUserService;
	}
    
    @GetMapping
    public List<AppUser> listAppUsers() {
        return appUserService.list();
    }

    @PostMapping
    public AppUser createAppUser(@RequestBody AppUser appUser) throws BadRequestException {
        return appUserService.create(appUser);
    }
}
