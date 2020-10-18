DROP TABLE IF EXISTS urls;
 
CREATE TABLE billionaires (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  original_url VARCHAR(250) NOT NULL,
  converted_url VARCHAR(250) 
  
);
 
INSERT INTO billionaires (original_url, converted_url) VALUES
  ('https://www.mi.com/in/flashsale/choosePro/index.html?pro=redmi-note-7-pro',''),
  ('https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles','');