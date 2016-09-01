import java.util.Date;

class commAct {
	static int onOff = 0;
	static int conversation = 0;
	private String name;
	private String other;

	public commAct (String nm, String oth){
		name = nm;
		other = oth;
		conversation++; 
		}

	public String getName(){
		return name;
		} 

	public static int howMany(){
		return conversation;
		}

	public String getOther(){
		if(conversation > 1){
			return "I'm talking to " + other;
			}
		return "I'm not talking to anyone right now";
		}
	}

class comm {
	public static void main (String[] args){
		commAct cA1 = new commAct("me", "you");
		System.out.println(cA1.howMany());
		System.out.println(cA1.getOther());
		commAct cA2 = new commAct("meToo", "youToo");
		System.out.println(cA2.getOther());
		System.out.println(cA2.howMany());	
		System.out.println(cA1.getName());
		
		//	long timeNow = System.currentTimeMillis();
		//	System.out.println(timeNow);
		Date dt = new Date();
  		System.out.println(dt.toString());
	}
}
