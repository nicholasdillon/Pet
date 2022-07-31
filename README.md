 
 
 
Grazioso Salvare Specification Document 
Overview 
Grazioso Salvare currently uses dogs as search and rescue animals. They expect to begin training 
monkeys as search and rescue animals as well. In current operations, dogs are given the status 
of “intake” before training starts. Once in training, their status can change to one of five phases: 
Phase I, Phase II, Phase III, Phase IV, and Phase V. When a dog graduates from training, it is given 
the status of “in-service” and is considered a Rescue Animal. If a dog does not successfully make 
it through training, it is given the status of “farm,” indicating that it will live a life of leisure on a 
Grazioso Salvare farm. 
The Animals 
Currently when Grazioso Salvare acquires a dog, they record the name, breed, gender, age, and 
weight. Grazioso Salvare also records the date and the location where they acquired the dog. 
Additionally, they track the training status of the dog, as described above. When a dog is “inservice”, they record the country where the dog is in service and whether or not the dog is 
“reserved”. 
Special Note on Monkeys 
As Grazioso Salvare explores the use of monkeys as search and rescue animals, they want their 
system to support monkey tracking as well as dog tracking. They have identified the following 
monkey species that are eligible for training: 
• Capuchin 
• Guenon 
• Macaque 
• Marmoset 
 
 
 
 
 
 
 
 
 
 
 
 
• Squirrel monkey 
• Tamarin 
There are important data elements for monkeys in addition to what they use for dogs. These 
include tail length, height, body length, and species. 
Functionality 
Work on this application has already been started. You must complete the following functionality: 
• Create a Monkey Class that: 
○ Inherits from the RescueAnimal class 
○ Includes monkey-specific attributes 
○ Includes mutator and accessor methods for each attribute 
• Complete the Driver Class. 
○ Add a menu loop that: 
■ Displays the (included) menu 
■ Prompts the user for input and validates the input 
■ Takes the appropriate action based on the input 
○ Complete a method to intake a new dog that: 
■ Prompts the user for input and validates the input 
■ Sets data for all attributes 
■ Adds the newly instantiated dog to an ArrayList 
○ Implement a method to intake a new monkey that: 
■ Prompts the user for input and validates based on monkey name and 
species type 
■ Sets data for all attributes 
■ Adds the newly instantiated monkey to an ArrayList 
○ Implement a method to reserve an animal that: 
■ Prompts the user for input 
■ If animal matches input criteria: Accesses animal object from ArrayList 
and updates the ‘reserved’ attribute of the animal 
■ If no animal matches input criteria: Prints feedback to the user 
○ Implement a method to print (display) information about the animals that: 
■ Prints a list of all dogs OR all monkeys OR all animals that are “in service” 
and available (not “reserved”) 
Note: There are comments throughout the code to guide you. There is also a method that adds 
some data to a dog array list so that you will have data for testing. You can add a similar method 
for monkeys if you like. 
