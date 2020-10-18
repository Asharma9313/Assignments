package com.assignment.url.shortenurl.service;

import static org.hamcrest.CoreMatchers.any;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.assignment.url.shortenurl.model.Url;
import com.assignment.url.shortenurl.repository.UrlRepository;
@RunWith(MockitoJUnitRunner.class)
public class UrlServiceTest {
	 @Mock
	    UrlRepository mockUrlRepository;

	  
	    @InjectMocks
	    UrlService urlService;

	    @Test
	    public void convertToShortUrlTest() {
	        Url url = new Url();
	        url.setOriginal_url("https://github.com/freebird9313/Assignments");
	    
	        url.setId((long)1);

	        when(mockUrlRepository.save(new Url())).thenReturn(url);       
	       

	        assertEquals("f", urlService.getShortenedUrl(url.getId().intValue()));
	    }

}
