package com.htmlscrapping.jsoup;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class SMS {

	        public static void main(String[] args) throws Exception {

	           Connection.Response loginForm = Jsoup.connect("http://site25.way2sms.com/content/index.html")
	            .method(Connection.Method.GET)
	            .execute();

	           Document document = Jsoup.connect("http://site25.way2sms.com/content/index.html")
	            .data("cookieexists", "false")
	            .data("username", "8531990331")
	            .data("login", "Login")
	            .cookies(loginForm.cookies())
	            .post();
	           System.out.println(document);

	       }

	    }
