package com.assignment.url.shortenurl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.url.shortenurl.service.UrlService;

@RestController
@RequestMapping(value="/api")
public class UrlController {
	@Autowired
	UrlService urlService;
	@PostMapping(value="/convertUrl")
	public String getShortenedUrl(@RequestBody String original_url) {
		return this.urlService.getShortenedUrl(original_url);
		
	}
	@GetMapping(value="/originalUrl/{shortenedUrl}")
	public String getOriginalUrl(@PathVariable String shortenedUrl) {
		return this.urlService.getOriginalUrl(this.urlService.calculateIdUsingShortUrl(shortenedUrl));
		
		
	}
}
