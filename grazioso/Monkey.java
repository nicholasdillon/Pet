public class Monkey {
    // instance variables of RescueAnimal class
    public class Monkey extends RescueAnimal {
        //instance variables of Monkey class 
        public int bodyLength;
        public int tailLength;
        public int height;
        public int species;
    }
    //Constuctor
    private String species;
    /**
     * @param name
     * @param gender
     * @param age
     * @param age
     * @param weight
     * @param acquisitionDate
     * @param acquisitionCountry
     * @param trainingStatus
     * @param reserved
     * @param inServiceCountry
     */
    public Monkey(String name, String gender, String age, String age, String weight, String acquisitionDate, String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry);
        this.bodyLength=bodyLength;
        this.tailLength=tailLength;
        this.height=height;
        this.species=species;
public Monkey(String string, String string2, String string3, String string4, String string5, String string6,
            String string7, boolean b, String string8, int i, int j, int k, String string9) {
    }
}
// accessor methods
public int getBodyLength();{
    Object bodyLength;
    return bodyLength;
}
public int getTailLength();{
    return tailLength;
}
public int getHeight();{
    return height;
}
public int getSpecies();{
    return species;
}
// mutator methods
    public void setBodyLength(int bodyLength);{
    this.bodyLength=bodyLength;
}
    public void setTailLength(int tailLength);{
    this.tailLength=tailLength;
}
    public void setHeight(int height);{
    this.height=height;
}
    public void setSpecies(String species){
    this.species=species;
}
    public static String getName() {
        return null;
    }
    public static String getTrainingStatus() {
        return null;
    }
    public String getAcquisitionLocation() {
        return null;
    }
    public String getReserved() {
        return null;
    }
    public Object getInServiceLocation() {
        return null;
    }
}
