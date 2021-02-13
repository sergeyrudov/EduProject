package Abstract;

public abstract class Profession {
    String professionName;
    String industry;

    public Profession(String professionName, String industry) {
        this.professionName = professionName;
        this.industry = industry;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public abstract void doJob();

    @Override
    public String toString() {
        return "Profession Info:" +
                "\nProfession Name: " + professionName +
                "\nIndustry: " + industry + "\n";
    }
}
