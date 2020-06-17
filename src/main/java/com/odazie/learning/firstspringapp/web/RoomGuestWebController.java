package com.odazie.learning.firstspringapp.web;

import com.odazie.learning.firstspringapp.business.domain.RoomGuest;
import com.odazie.learning.firstspringapp.business.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guests")
public class RoomGuestWebController {
    private final GuestService guestService;

    @Autowired
    public RoomGuestWebController(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping
    public String getGuests(Model model){
        List<RoomGuest> roomGuests = this.guestService.printAllGuestAlphabeticallyByLastName();

        model.addAttribute("roomGuests", roomGuests);
        return "guests";
    }


}
