class Workaholic extends Worker {
	public static final int OVERTIME = 500;
	
	//constructor for 3 parameters
	public Workaholic(String name, float hourlyIncome, int age) {
		//coWorker null to begin with
		super(name, hourlyIncome, age, null);
		
	}
	
	//replaced private data members with getters and setters of superclass
	public void work(int hours) {
		for (int i = 1; i <= hours; i++)
			setEarned(getEarned() + getHourlyIncome());
		for (int j = 1; j <= OVERTIME; j++)
			setEarned(getEarned() + getHourlyIncome());
	}

	//changed to use getters and setters
	@Override
	public void work() {
		while (getAge() < RETIREMENT_AGE) {
			work(2000);
			//increment age until retirement age
			setAge(getAge() + 1);
		}
	}

	public String info() {
		return getName() + " earned " + getEarned();
	}
}
