
public class Purse {
	
	private int pence = 0;
	private int shilling = 0;
	
	public Purse() {};
	
	public void addPence(int penceToAdd) {
		
		if(penceToAdd > 0) {
			pence += penceToAdd;
		}
		
	}
	
	public void addShilling(int shillingToAdd) {
		
		if(shillingToAdd > 0) {
			shilling += shillingToAdd;
		}
		
	}
	
	public String getPurse() {
		return "The purse has: " + pence + " pence, and " + shilling + " shillings.";
	}

}
