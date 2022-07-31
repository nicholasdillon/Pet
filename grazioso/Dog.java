
public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;

    // Constructor
    public Dog(String name, String breed, String gender, String age,
    String weight, int i, String acquisitionCountry,
	String trainingStatus, boolean string, String inServiceCountry) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(i);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(string);
        setInServiceCountry(inServiceCountry);

    }

    public Dog(String name, String breed2, String gender, String age, String weight, String string,
            String acquisitionCountry, String trainingStatus, boolean b, String inServiceCountry) {
    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

}
