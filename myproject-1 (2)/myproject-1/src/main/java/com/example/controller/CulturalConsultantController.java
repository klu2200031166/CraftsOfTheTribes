package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CulturalConsultantController {

    // Handles the form submission from the collaboration page
    @PostMapping("/submit-collaboration")
    public ModelAndView submitCollaboration(@RequestParam("artisan-name") String artisanName,
                                            @RequestParam("message") String message) {
        // Process the form data (you can add your own logic here)
        System.out.println("Artisan Name: " + artisanName);
        System.out.println("Message: " + message);

        // Return a view (e.g., a success page or redirect to the same page with a success message)
        ModelAndView modelAndView = new ModelAndView("collaborationSuccess");
        modelAndView.addObject("artisanName", artisanName);
        return modelAndView;
    }
}
