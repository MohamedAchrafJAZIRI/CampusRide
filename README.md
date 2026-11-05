# CampusRide - student carpooling website (REST API)

Spring Boot 3 + Spring Data JPA + MySQL. 6 entities: Student, Car, City, Trip, Booking, Review.

## Run in Spring Tools (STS)
1. File > Import > Maven > Existing Maven Projects > select this folder.
2. Start MySQL (XAMPP/WAMP/MySQL service). DB `campusride` is created automatically.
3. Edit `src/main/resources/application.properties` if your MySQL password is not empty.
4. Right-click `CampusRideApplication` > Run As > Spring Boot App.
5. Import `CampusRide.postman_collection.json` in Postman and run the requests in order.

Demo data inserted at startup: cities 1=Tunis, 2=Sousse, 3=Sfax; students 1=Mhissen, 2=Sara.

## Endpoints
CRUD on: /api/trips, /api/students, /api/cars, /api/cities, /api/bookings, /api/reviews

Custom queries:
- GET /api/trips/search?from=Tunis&to=Sousse
- GET /api/trips/cheap?max=10
- GET /api/trips/driver/{id}/rating

Errors: 400 validation, 404 not found, 409 conflict.
