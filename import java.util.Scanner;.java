import java.util.Scanner;
public class Pet {
    // private instance variables
    private String petType;
    private String petName;
    private int petAge;
    private String dogSpace;
    private String catSpace;
    private String daysStay;
    private double amountDue;

    // Pet default constructor
     public Pet(String petType, String petName, int petAge, String dogSpace, String catSpace, String daysStay, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpace = dogSpace;
        this.catSpace = catSpace;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
     }
     // Check in method
     public void checkIn() {
      // initialize cat space and dog space
      setCatSpace("12");
      setDogSpace("30");
   System.out.println("Hello, Have you been here before? (yes/no)");
   // input for yes or no
   Scanner input = new Scanner(System.in);
   String answer = input.nextLine();
   // Do you have a dog or cat?
   if (CustomerChoice.equals("cat")){
      System.out.println("A CAT, GOT IT!");
      if (getCatSpace() >= 1) {
         System.out.println("We can check you in!");
         System.out.println ("Is your cat a 'new' or 'returning' with us?");
         //Check if user has been here or not before
         String CatVisitor = input.nextLine();
         if (CatVisitor.equals("new")) {
            System.out.println("Your cat is a new visitor!");
            System.out.println("How old is your cat?");
            int catAge = input.nextInt();
            setPetAge(catAge);
            System.out.println("How many days will you be staying?");
            int daysStay = input.nextInt();
            setDaysStay(daysStay);
            System.out.println("How much will you be paying?");
            double amountDue = input.nextDouble();
            setAmountDue(amountDue);
            System.out.println("Your cat will be checked in!");
            setCatSpace(getCatSpace() - 1);
         } else if (CatVisitor.equals("returning")) {
            System.out.println("Your cat is a returning visitor!");
            System.out.println("How old is your cat?");
            int catAge = input.nextInt();
            setPetAge(catAge);
            System.out.println("How many days will you be staying?");
            int daysStay = input.nextInt();
            setDaysStay(daysStay);
            System.out.println("How much will you be paying?");
            double amountDue = input.nextDouble();
            setAmountDue(amountDue);
            System.out.println("Your cat will be checked in!");
            setCatSpace(getCatSpace() - 1);
         } else {
            System.out.println("Sorry, We don't have anymore space.");
         }
      } else if (user.Choice.equals("dog")) {
         System.out.println("A DOG, GOT IT!");
         // Check dog space
         if (getDogSpace() >= 1) {
            System.out.println("We can check you in!");
            System.out.println ("Is your dog a 'new' or 'returning' with us?");
            //Check if user has been here or not before
            String DogVisitor = input.nextLine();
            if (DogVisitor.equals("new")) {
               System.out.println("Your dog is a new visitor!");
               System.out.println("How old is your dog?");
               int dogAge = input.nextInt();
               setPetAge(dogAge);
               System.out.println("How many days will you be staying?");
               int daysStay = input.nextInt();
               setDaysStay(daysStay);
               System.out.println("How much will you be paying?");
               double amountDue = input.nextDouble();
               setAmountDue(amountDue);
               System.out.println("Your dog will be checked in!");
               setDogSpace(getDogSpace() - 1);
            } else if (DogVisitor.equals("returning")) {
               System.out.println("Your dog is a returning visitor!");
               System.out.println("How old is your dog?");
               int dogAge = input.nextInt();
               setPetAge(dogAge);
               System.out.println("How many days will you be staying?");
               int daysStay = input.nextInt();
               setDaysStay(daysStay);
               System.out.println("How much will you be paying?");
               double amountDue = input.nextDouble();
               setAmountDue(amountDue);
               System.out.println("Your dog will be checked in!");
               setDogSpace(getDogSpace() - 1);
            } else {
               System.out.println("Sorry, We don't have anymore space.");
            }
         } else {
            System.out.println("Sorry no room left in Cat space");

        }
         } 
      }

      }
   }
   // decrease dog space by 1
   int currentDogSpace = getDogSpace();
   setDogSpace(currentDogSpace - 1);
   } else if (dogVistor.equals("returning")) {
  system.out.println("Thanks for coming back in!");
  system.out.println("Please allow us to pudate someo of your dog information.");
  System.out.println("How many days will your dog be staying?");
  int DogDaysStay = input.nextInt();
  // check if grooming for returing dog 
  if(dogDays >= 2){
   System.out.println("Grooming services are avaiable for your dog!");
  } else {
   System.out.println("Grooming services are not available for your dog!");
  }
// decrease dog space by 1 for returning
int currentDogSpace = getDogSpace();
setDogSpace(currentDogSpace - 1);
updatePet();
         } else {
            System.out.println("Sorry, We don't have anymore space.");
         }
      } else {
         System.out.println("Invaild choice, please selcet 'cat' or 'dog'");
      }
      // CheckIn ();
   }
   // Check out method
   public void checkOut() {
      checkOut();
   }
   // getPet method
   public void getPet() {
      getPet();
   }
   // createPet method
   public void createPet() {
      createPet();
   }
   // updatePet method
   public void updatePet() {
      //updatePet();
   }


   public String getPetType() {
      return petType;
   }
   public void setPetType(String petType) {
      this.petType = petType;
   }
   }
   public String getPetName() {
      return petName;
   }

   public void setPetName(String petName) {
      this.petName = petName;
   }
   public int getPetAge() {
      return petAge;
   }
public void setPetAge() {
   return petAge;
}
   public int getDogSpace() {
      return dogSpace;
   }
}
   public void setDogSpace(int dogSpace) {
      this.dogSpace = dogSpace;
   }
   public int getCatSpace() {
      return catSpace;
      
   public void setCatSpace(int catSpace) {
      this.catSpace = catSpace;
   }

   public int getDaysStay() {
      return daysStay;
   }
   public void setDaysStay(int daysStay) {
      this.daysStay = daysStay;
   }

   pubilc double getAmountDue() {
      return amountDue;
   }
   public void setAmountDue(double amountDue) {
      this.amountDue = amountDue;
   }
   
}