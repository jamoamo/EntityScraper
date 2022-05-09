# Entity Scraper
Java Annotation based web scraping

Version 0.0.1 to be released by 15/05/2022.

## Overview
Java library for scrpaing web page data into a java class using only annotations. Class fields are annotated with the XPath query that indicates how the value should be extracted from the web page.

## Features

### HTML parsing
* Jsoup based implementation by default
* Custom implementations can be provided

### Querying of Document Model
* XPath querying implementation provided by Jaxen
* Custom implementations can be provided

### Supported Value Types
* String

## Example

### Annotations

    @Entity (basePath = "/html")
    public class WebPage 
    {
       @XPath(path = "/head/title")
       private String pageTitle;
       
       public String getPageTitle()
       {
          return this.pageTitle;
       }

       public void setPageTitle(String pageTitle)
       {
         this.pageTitle = pageTitle;
       }
    }

### Scraper

    EntityScraper scraper = EntityScraperBuilder.entityClass(WebPage.class).build();
    WebPage webpage = scraper.scrape(new URL("www.google.com"));

##Versions

### v0.0.1 
Initial release
Not released yet. To be released by 15 May 2022.

##Diclaimer

Backwards compatible changes to be expected until the API is considered stable when v1.0 is released. Any backwards compatibility differences will be documented here:
* No compatibility changes yet.