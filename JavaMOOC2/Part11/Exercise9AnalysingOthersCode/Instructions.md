# Java MOOC Exercise – Packages

This module in part 11 is aimed at helping the developer to understand code structure, either for ourselves or when navigating others' (title of the part studied is 'Directory structure in a file system')

For this task I was asked to analyse the code provided (which is described below and available in the folders within this exercise):

##### Application logic

File: FlightControl.java
The application logic is typically kept separate from the classes that represents concepts of the problem domain. In our example, the application logic is stored in the package logic. Application logic includes the functionality to add airplanes and flights, and to list them.

##### Classes that represent concepts of the problem domain

Files: Place.java, Airplane.java, Flight.java
The classes that represent concepts of the problem domain are often placed inside a package called domain. Since the entirety of the application is inside the package flightControl, let's place the package domain inside the package flightControl. Concepts of the problem domain are represented by the classes Place, Airplane, and Flight.

### Task:

Explain in your own words how the class roughly works. In addition to the rough description please also explain:

1. Why planes, flights and places are saved in a hash map
2. How the method addAirplane works
3. How the method addFlight works

### Answer:

The FlightControl class is responsible for managing the core logic of a flight control system. It keeps track of airplanes, flights, and places (airports/cities) using internal data structures. The class allows to add airplanes and flights, and retrieve collections of existing airplanes and flights. It represents a central hub that connects the all the three domain objects: Airplane, Flight, and Place.

1. HashMaps are used because they allow fast and efficient access to data using a unique key:
   Airplanes are stored with their ID as the key (e.g., "HA-123"), so you can quickly retrieve a specific airplane.
   Flights are stored using their string representation (via flight.toString()) as the key, ensuring each flight is uniquely identified.
   Places are stored using their ID (e.g., "JFK", "LHR") to avoid creating duplicate Place objects for the same location.

Also, using HashMaps ensures:
Constant-time lookup and insertion.
Easy checking for existence (e.g., putIfAbsent for places).
Clear organization of data by unique identifiers.

2. This method creates a new Airplane object using the provided ID and capacity, then stores the airplane in the airplanes HashMap using the ID as the key and finally if an airplane with the same ID already exists, it will be overwritten.

3. First, it ensures that both the departure and destination places exist in the places map. If not, it creates and adds them.
   Second, it creates a new Flight object using the given Airplane and the two Place objects.
   Finally, it stores the flight in the flights HashMap using the flight’s string representation as the key (and so the method ensures that each flight is properly linked to existing places and airplanes).

##### Text user interface

I have also added the code with the ui to have the whole app provided by the University of Helsinki for future reference.

File: TextUI.java
The user interface is separate from the application logic and the classes that represent the problem domain. In this example, the user interface is stored in the package ui.
