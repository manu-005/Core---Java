class PassPortSevaRunner{
	
	
	public static void main(String args[]){
	boolean userIsRegistered=PassPortSevaValidator.validateUser("Manoj","B","@1123","@1123");
	System.out.println("is user registered:"+userIsRegistered);
	
	if(userIsRegistered){
	PassPortSeva.getUserInfo();
	}
	}

}