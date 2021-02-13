package Abstract;

public class Developer extends Profession{
    private String specialty;

    public Developer(String professionName, String industry, String specialty) {
        super(professionName, industry);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void doJob() {
        System.out.println("Developer writes code...");
    }

    @Override
    public String toString() {
        return "Developer Info" +
                "\nProfession Name: " + this.getProfessionName() +
                "\nIndustry: " + this.getIndustry() +
                "\nSpecialty: " + specialty;
    }
}
