package Abstract;

public class Pilot extends Profession{
    private String aircraftType;

    public Pilot(String professionName, String industry, String aircraftType) {
        super(professionName, industry);
        this.aircraftType = aircraftType;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    @Override
    public void doJob() {
        System.out.println("Pilot controls " + this.aircraftType);
    }

    @Override
    public String toString() {
        return "Pilot Info" +
                "\nProfession Name: " + this.getProfessionName() +
                "\nIndustry: " + this.getIndustry() +
                "\nAircraft type: " + aircraftType;
    }
}
