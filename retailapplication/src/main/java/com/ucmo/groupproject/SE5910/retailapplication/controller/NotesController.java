package com.ucmo.groupproject.SE5910.retailapplication.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ucmo.groupproject.SE5910.retailapplication.models.Notes;
import com.ucmo.groupproject.SE5910.retailapplication.models.User;
import com.ucmo.groupproject.SE5910.retailapplication.repositories.NotesRepository;
import com.ucmo.groupproject.SE5910.retailapplication.services.CustomUserDetailsService;

// 38.
@Controller
public class NotesController {

	// 39.
	@Autowired
	private CustomUserDetailsService userService;

	// 39.
	@Autowired
	private NotesRepository noteRepository;

	// 39.
	@RequestMapping(value = "/notes", method = RequestMethod.GET)
	public ModelAndView notes() {
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("notes", noteRepository.findAll());
		modelAndView.addObject("currentUser", user);
		modelAndView.addObject("fullName", "Welcome " + user.getFullname());
		modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
		modelAndView.setViewName("notes");
		return modelAndView;
	}

	// 39.
	@RequestMapping("/notes/create")
	public ModelAndView create() {
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("currentUser", user);
		modelAndView.addObject("fullName", "Welcome " + user.getFullname());
		modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
		modelAndView.setViewName("create");
		return modelAndView;
	}

	// 39.
	@RequestMapping("/notes/save")
	public String save(@RequestParam String title, @RequestParam String content) {
		Notes note = new Notes();
		note.setTitle(title);
		note.setContent(content);
		note.setUpdated(new Date());
		noteRepository.save(note);

		return "redirect:/notes/show/" + note.getId();
	}

	// 39.
	@RequestMapping("/notes/show/{id}")
	public ModelAndView show(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("currentUser", user);
		modelAndView.addObject("fullName", "Welcome " + user.getFullname());
		modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
		modelAndView.addObject("note", noteRepository.findById(id).orElse(null));
		modelAndView.setViewName("show");
		return modelAndView;
	}

	// 39.
	@RequestMapping("/notes/delete")
	public String delete(@RequestParam Long id) {
		Notes note = noteRepository.findById(id).orElse(null);
		noteRepository.delete(note);

		return "redirect:/notes";
	}

	// 39.
	@RequestMapping("/notes/edit/{id}")
	public ModelAndView edit(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("currentUser", user);
		modelAndView.addObject("fullName", "Welcome " + user.getFullname());
		modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
		modelAndView.addObject("note", noteRepository.findById(id).orElse(null));
		modelAndView.setViewName("edit");
		return modelAndView;
	}

	// 39.
	@RequestMapping("/notes/update")
	public String update(@RequestParam Long id, @RequestParam String title, @RequestParam String content) {
		Notes note = noteRepository.findById(id).orElse(null);
		note.setTitle(title);
		note.setContent(content);
		note.setUpdated(new Date());
		noteRepository.save(note);

		return "redirect:/notes/show/" + note.getId();
	}

}
