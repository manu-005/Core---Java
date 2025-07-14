class PassPortSeva{
	
	static String givenName;
	static String surName;
	static String password;
	static String cfmPwd;
	
	public static void getUserInfo(){
		cfmPwd=PassPortSevaValidator.cfmPwd;
		System.out.println("the given name is:"+PassPortSevaValidator.givenName);
		System.out.println("the sur name is:"+PassPortSevaValidator.surName);
		System.out.println("the given password is:"+PassPortSevaValidator.password);
		System.out.println(" the Confirm Password is :"+cfmPwd);
		

		
	}
	
}