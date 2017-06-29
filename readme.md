# Task
Implement an API query and transform this data into a csv file. Create a Java command line tool that takes as an input parameter a string
```
java -jar GoEuroTest.jar "CITY_NAME"
```
The program takes this string and queries with it our Location JSON API: The app should use this API endpoint:

https://www.goeuro.com/suggester-api/v2/position/suggest/en/CITY_NAME

Where CITY_NAME is the string that the user has entered as a parameter when calling the tool, e.g.

https://www.goeuro.com/suggester-api/v2/position/suggest/en/Berlin

The API endpoint returns JSON documents like these:

```json
[
   {
      "_id":376217,
      "key":null,
      "name":"Berlin",
      "fullName":"Berlin, Germany",
      "iata_airport_code":null,
      "type":"location",
      "country":"Germany",
      "geo_position":{
         "latitude":52.52437,
         "longitude":13.41053
      },
      "locationId":8384,
      "inEurope":true,
      "countryId":56,
      "countryCode":"DE",
      "coreCountry":true,
      "distance":null,
      "names":{
         "it":"Berlino",
         "pt_BR":"Berlim",
         "fi":"Berliini",
         "es":"Berlín",
         "pt":"Berlim",
         "ru":"Берлин",
         "is":"Berlín",
         "zh":"柏林",
         "cs":"Berlín",
         "ca":"Berlín",
         "nl":"Berlijn"
      },
      "alternativeNames":{

      }
   },
   {
      "_id":425332,
      "key":null,
      "name":"Berlingerode",
      "fullName":"Berlingerode, Germany",
      "iata_airport_code":null,
      "type":"location",
      "country":"Germany",
      "geo_position":{
         "latitude":51.45775,
         "longitude":10.2384
      },
      "locationId":124675,
      "inEurope":true,
      "countryId":56,
      "countryCode":"DE",
      "coreCountry":true,
      "distance":null,
      "names":{
         "ru":"Берлингероде"
      },
      "alternativeNames":{

      }
   }   
]
```

The endpoint always responds with a JSON array that contains JSON objects as elements. Each object, among other keys, has a name and a geo_position key. The geo_position key is an object with latitude and longitude fields. If no matches are found an empty JSON array is returned.

The program should query the API with the user input and create a CSV file from it. The CSV file should have the form: _id, name, type, latitude, longitude.

# Technologies used
* Spring Framework
* Spring Boot
* Google Guava
* Project Lombok
* Apache HttpClient
* Jackson

# How to run?
Build the project using maven command:
```
mvn package
```
Test compiled and packaged JAR with the following command:
```
java -jar target/GoEuroTest.jar "Kiev"
```
See the newly created `Kiev.csv` file.