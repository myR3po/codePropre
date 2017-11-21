package ex2;

public enum TypeCompteBancaire{ 
	LIVRET_A("LA"), 
	COMPTE_COURANT("CC");
	
	@SuppressWarnings("unused")
	private String type;
	
	TypeCompteBancaire(String type){
		this.type = type;
	}
}
