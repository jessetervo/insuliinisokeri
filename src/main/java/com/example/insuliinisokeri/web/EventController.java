package com.example.insuliinisokeri.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.insuliinisokeri.domain.Event;
import com.example.insuliinisokeri.domain.EventRepository;



@Controller
public class EventController {
	
	@Autowired
	private EventRepository repository;
	
	@RequestMapping("/eventlist")
	public String eventList(Model model) {
	model.addAttribute("events", repository.findAll());
		return "eventlist";
	}
	
    @RequestMapping(value = "/add")
    public String addEvent(Model model){
    	model.addAttribute("Event", new Event());
        return "addevent";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Event event){
        repository.save(event);
        return "redirect:eventlist";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteEvent(@PathVariable("id") Long eventId, Model model) {
    	repository.deleteById(eventId);
        return "redirect:../eventlist";
    }  
}
