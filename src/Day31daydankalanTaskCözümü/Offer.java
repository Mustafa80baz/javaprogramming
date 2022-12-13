package Day31daydankalanTaskCözümü;

public class Offer {
    public String location;
    public String compnyName;
    public String jobTitle;
    public double salary;
    public boolean hasBenifets;//aynı typr ları tan tana yazabiliriz.hasbenifet,hasPTO,isWFH gibi
    public boolean hasPTO;
    public boolean isWFH;
    public boolean isFulltime;

    public void setInfo (String location, String compnyName, String jobTitle,
      double salary, boolean hasBenifets, boolean hasPTO, boolean isWFH, boolean isFulltime) {
        this.location = location;
        this.compnyName = compnyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenifets = hasBenifets;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFulltime = isFulltime;



    }
        public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", compnyName='" + compnyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", hasBenifets=" + hasBenifets +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFulltime=" + isFulltime +
                '}';
    }

}
