package beans;

public class Entry {
	private long entryId;
	private String competitionType;
	private String competitionClass;
	private String dogName;
	private String ownerName; 
	private double entryFee;
	
	public Entry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entry(long entryId, String competitionType, String competitionClass, String dogName, String ownerName ) {
		super();
		this.entryId = entryId;
		this.competitionType = competitionType;
		this.competitionClass = competitionClass;
		this.dogName = dogName;
		this.ownerName = ownerName;  
		this.entryFee = getEntryFee();
	}



	public long getEntryId() {
		return entryId;
	}



	public void setEntryId(long entryId) {
		this.entryId = entryId;
	}

	public String getCompetitionType() {
		return competitionType;
	}

	public void setCompetitionType(String competitionType) {
		this.competitionType = competitionType;
	}

	public String getCompetitionClass() {
		return competitionClass;
	}

	public void setCompetitionClass(String competitionClass) {
		this.competitionClass = competitionClass;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

 

	public double getEntryFee() {
		if (this.competitionType.equalsIgnoreCase("Agility")) {
			this.entryFee = 50.50;
		}else if (this.competitionType.equalsIgnoreCase("Draft")) {
			this.entryFee = 75.00;
		}else if (this.competitionType.equalsIgnoreCase("Rally")) {
			this.entryFee = 30;
				
		}else {
			this.entryFee = 10;
		}
		return entryFee;
	}

	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}

	@Override
	public String toString() {
		return "Entry [entryId=" + entryId + ", competitionType=" + competitionType + ", competitionClass="
				+ competitionClass + ", dogName=" + dogName + ", ownerName=" + ownerName + ", entryFee=" + entryFee
				+ "]";
	}
	
	
}
