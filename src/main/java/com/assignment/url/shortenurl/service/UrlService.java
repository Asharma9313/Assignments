package com.assignment.url.shortenurl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.url.shortenurl.model.Url;
import com.assignment.url.shortenurl.repository.UrlRepository;

@Service
public class UrlService {
  @Autowired
  UrlRepository urlRepository;
	public String getShortenedUrl(int k) {
       char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();  
     
       StringBuffer sl = new StringBuffer();  
     
    
       while (k > 0)  
       {  
           sl.append(map[k % 62]); 
           k = k / 62;  
       }  
       return sl.reverse().toString();
	}
	public int calculateIdUsingShortUrl(String s) {
		 int ID = 0; 
	     
	        for (int i = 0; i < s.length(); i++)  
	        {  
	            if ('a' <= s.charAt(i) &&  
	                       s.charAt(i) <= 'z')  
	            ID = ID * 62 + s.charAt(i) - 'a';  
	            if ('A' <= s.charAt(i) &&  
	                       s.charAt(i) <= 'Z')  
	            ID = ID * 62 + s.charAt(i) - 'A' + 26;  
	            if ('0' <= s.charAt(i) &&  
	                       s.charAt(i) <= '9')  
	            ID = ID * 62 + s.charAt(i) - '0' + 52;  
	        }  
	        return ID;  
	}
	public String getShortenedUrl(String s) {
		Url u=new Url();
		u.setOriginal_url(s);
		Url savedUrl=this.urlRepository.save(u);
		return this.getShortenedUrl(savedUrl.getId().intValue());
	}
	public String getOriginalUrl(long id) {
		
		Url originalUrl=this.urlRepository.getOne(id);
		return originalUrl.getOriginal_url();
	}
}
