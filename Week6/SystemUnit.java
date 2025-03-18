public class SystemUnit{
	
 	private String cpuName;
	private int ramSize;
	private int discSize ;
	private String systemid;
	private String lcdModel;
 
	SystemUnit(String cpuName,int ramSize,int discSize,String systemid,String lcdModel){
		this.cpuName=cpuName;
		this.ramSize=ramSize;
		this.discSize=discSize;
		this.lcdModel=lcdModel;

	}
 	
	public String getCpuName(){
	return cpuName;
	}

	public void setCpuname(String cpuName){
	this.cpuName=cpuName;
	}

	public int getRamSize(){
	return ramSize;
	}

	public void setDiscSize(int discSize){
	this.discSize=discSize;
	}

	public int getdiscSize(){
	return discSize;
	}

	public void setLcdModel(String lcdModel){
	this.lcdModel=lcdModel;
	}

	public String getlcdModel(){
	return lcdModel;
	}

	public void setSystemid(String systemid){
	this.systemid=systemid;
	}

	public String getSystemid(){
	return systemid;
	}

	public String toString(){
	return String.format("CPU Name:%s\n ramSize:%d\n discSize:%d\n Systemid:%s\n lcdModel:%s",cpuName,ramSize,discSize,systemid,lcdModel);

	}


}