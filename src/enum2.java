public enum enum2{
	
	bucky("nice", "22"),
	kelsey("tall","10"),
	julia("short","12");
	
	private final String desc;
	private final String year;
	
	enum2(String description, String birthday){
		desc =description;
		year=birthday;
		
		
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getYear() {
		return year;
	}
}


