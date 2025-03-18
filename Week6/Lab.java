public class Lab{
	
	private String labName;
	private Employe labStaff;
	private SystemUnit system[]=new SystemUnit[50];	
	private boolean hasMultimedia;


	public Lab(String labName, Employe labStaff, SystemUnit[] system,boolean hasMultimedia){
		this.labName=labName;
		this.labStaff=labStaff;
		this.system=system;
		this.hasMultimedia=hasMultimedia;
		
	}

	public void setLabName(String labName){
		this.labName=labName;
	}

	public String getLabName(){
		return labName;
	}
	
	public void setHasMultimedia( boolean hasMultimedia){
		this.hasMultimedia=hasMultimedia;
	}
		
	public boolean getHasMultimedia(){
		return hasMultimedia;
	}

	void setLabStaff(Employe labStaff){
		this.labStaff=labStaff;
	}

	public Employe getLabStaff(){
		return labStaff;
	}

	void setSystem(SystemUnit[] system){
		this.system=system;
	}

	public SystemUnit[] getSystemArray(){
		return system;
	}

	public String toString(){
		StringBuilder st= new StringBuilder();
		st.append(labName);
		st.append(labStaff);
		for(int i=0; i<system.length;i++){
			st.append(system[i]);
		}
		st.append(hasMultimedia);
		return st.toString();
	}

	


}