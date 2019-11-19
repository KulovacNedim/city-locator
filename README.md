# City Locator

REST backend - SpringBoot application created to serve together with the [frontend Angular application](https://github.com/KulovacNedim/city-locator-ui).
                             
It is basic CRUD application integrating Google Maps.

## Technologies used in this project: 

1. Spring Boot
2. Hibernate
3. Maven

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Clone

Clone this repo to your local machine using `https://github.com/KulovacNedim/city-locator.git`

### Prerequisites

In order to build this project and run it locally you will need: 

1. JDK 8 (or higher)
2. Maven 

### Configuration

In order to install and run this project locally, you will need to configure the Data source for the application (database) in the application.properties file located in src/main/resources.

## REST endpoints

All the CRUD operations can be done through the following endpoints:

 GET HTTP method

1. >`{base_url}/api/location`

   returns a list of all Location objects from the database
   
2. >`{base_url}/api/location/{id}`

   returns Location object with specific id

POST HTTP method

1. >`{base_url}/api/location`

    stores a specific Location object in the database

##### DELETE HTTP method

1. >`{base_url}/api/location/{id}`

    deletes a specific Location object from the database

##### PUT HTTP method

1. >`{base_url}/api/location`

   updates a specific Location object in the database
