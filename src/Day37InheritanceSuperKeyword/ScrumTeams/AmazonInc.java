package Day37InheritanceSuperKeyword.ScrumTeams;

public class AmazonInc {
    public static void main(String[] args) {
        ProductOwner po=new ProductOwner("baz",45,'M',"po",1,68347678,"keke");
  BusinessAnalyst ba=new BusinessAnalyst("ali",23,'M',"BA",34,46000,"apple");
        ScrumMaster sm=new ScrumMaster("Numan",32,'M',"Scrm",34,455600, ba.companyName);
    }
}
