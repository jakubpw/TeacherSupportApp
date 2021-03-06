package com.nokia.teachersupport.personSecurity.personEditProfile;

import com.nokia.teachersupport.currentUser.CurrentUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Objects;

@Controller
public class EditProfileController {

    /* To cos to tak naprawde nie zwraca string tylko tutaj mamy parsowanie calej str html na string jakby
     * strone index on nam zparsuje na string ktory jest czytelny dla app  */
    @GetMapping("/teacherSupportEditProfile")
    String editprofile(Model model)
    {
        model.addAttribute("currentUserName",Objects.requireNonNull(CurrentUser.getCurrentUserName()));
        return "teacherSupportEditProfile";
    }
}