## @author steve astudillo
## 06 June 2026

# Pet Shelter Management System

## Project Overview

The Pet Shelter Management System simulates daily operations of a pet shelter. This system will track animals, staff assignments, adoptions, and animal care while monitoring their state changes over time.

## Features
- Automatically starts with 5 animals in the shelter
- Creates new animals using Factory Patterns
- Tracts animal status using state pattern
- Simulates when an animal arrives at shelter
- Has Verterinarian and Adoption Counselor 
- Runs automatically over a 7 day week.
- Simulates medical and provides health updates

## Planned Design Patterns

Factory Pattern:

The Factory Pattern will create different types of animals entering the shelter, for example dogs, cats and rabbits such as dogs, This will make creation easier when adding new animals later on.

State Pattern:

The State Pattern will manage animal status transitions. Animals may move through states such as Intake, Available, Pending Adoption, and Adopted.

## Integration Strategy

Animals will be created using Factory pattern and assigned an inital state after. The state pattern will manage status transition as the animals move through the shelter adoption workflow.

## Requirements Focus

1. R1.1 Core Animals and Intake
2. R1.2 New Animal Arrivals
3. R1.3 Animal Status Tracking
4. R2.1 Staff Roles
5. R3.1 Adoption Preferences
6. R3.3 Adoption Outcomes

## Running The Project
Build  the project: 
./gradlew build

Running the App:
./gradlew run

Running Test:
./gradlew test

## Testing
Junit tests include:
- Animal Factory
- Shelter functionaility
- Adopter functionaility
- Veterinarian functionaility

67% code coverage with Jacoco

## Screencast Link:
https://youtu.be/9Bu9DD8nNdI

## Concerns / Questions

- Managing the state transitions