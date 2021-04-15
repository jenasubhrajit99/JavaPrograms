public class Encapsulation_Extension
{
	public static void main(String[] args) 
	{
		Encapsulation_Ex enc = new Encapsulation_Ex();
		enc.setAcc_no(37528409884L);
		enc.setName("Subhrajit");
		enc.setEmailid("jenasubhrajit99@gmail.com");
		enc.setAmount(50000f);
		System.out.println(" Name ="+enc.getName()+"\n "+"Account Number = "+enc.getAcc_no()+"\n "+"EmailId ="+enc.getEmailid()+"\n "+"Amount ="+enc.getAmount());  
	}
}
