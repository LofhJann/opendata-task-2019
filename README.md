# Eficode Open Data Task 2019

https://lofhjann-opendata-task-2019.herokuapp.com/

Visualization and database for data provided in foreign API. All times are UTC in 'dd-MM-yyyy HH:mm' format.

## Technologies used

I completed task using **Java SpringBoot** complete with **Thymeleaf** for templates.
As database **h2** was used for development with **PostgreSQL** for production.
Charts are implemented using **Javascript** provided by **Google Charts**. Layouts are
handled by customizing bare for own needs **Bootstrap**.

Other technologies used include **Project Lombok** to reduce boilerplate, **Heroku** for easy deployment

... And crontabs running on Amazon EC2 to provide refresh of data hourly by CURLing Application Paths :P

Data should also be updated by Thread() in SensorDataService, but since free Heroku has auto-sleep, it's not bulletproof.

## Instructions
Launch application by navigating to https://lofhjann-opendata-task-2019.herokuapp.com/.

To develop install compatible version of JDK (version 8 is used on this project), fork
and load project on your preferred IDE, Maven should handle dependencies as long as your IDE
has support for it. Profile 'dev' should be used for h2-console to be loaded and database auto-populated.

## Paths

Application has 2 paths,

https://lofhjann-opendata-task-2019.herokuapp.com/history for full history of sensor data.

and

https://lofhjann-opendata-task-2019.herokuapp.com/ for Charts with 24 last datapoints visible.

There is also hidden path (https://lofhjann-opendata-task-2019.herokuapp.com/sensordata/create) 
used for getting current data from API, this shouldn't be needed as refreshing should happen automatically.


## Original Task
We at Eficode had a good will to create a system that would report a certain sensor data over around the internet. The result is a service that returns changing sensor data every hour.

What we were not able to, was to show any visualization of the data, nor were we able to show any history of the information collected. For this, **we need your help**.

## The data

For this task you will have to make a request to `/api/events` to receive the JSON response below. The event changes once per hour, and contains data from four different sensors.

To be able to access the `/api/events`, you will have to set a request header using the **accessToken** you received when signing up (or logging in): `Authorization: Bearer <your accessToken>`.

```
{
  "date": "2019-01-29T22:00:00.000Z",
  "sensor1": XXX,
  "sensor2": XXX,
  "sensor3": XXX,
  "sensor4": XXX
}
```
