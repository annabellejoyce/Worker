class Worker {
	public static final int RETIREMENT_AGE = 65;
	private String name = null;
	private int age = 0;
	private float earned = 0.0f;
	private float hourlyIncome = 0.0f;
	private Worker coWorker = null;

	public Worker(String name, float hourlyIncome, int age, Worker coWorker) {
		this.name = name;
		this.hourlyIncome = hourlyIncome;
		this.age = age;
		this.coWorker = coWorker;
	}
	
	//getters and setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public float getEarned() {
		return this.earned;
	}
	
	public void setEarned(float earned) {
		this.earned = earned;
	}
	
	public float getHourlyIncome() {
		return this.hourlyIncome;
	}
	
	public void setHourlyIncome(float hourlyIncome) {
		this.hourlyIncome = hourlyIncome;
	}

	public void work(int hours) {
		for (int i = 1; i <= hours; i++) {
			earned += hourlyIncome;
			if (coWorker != null && i % 5 == 0)
				delegate(1); // from time to time
		}
	}

	public void work() {
		while (age++ < RETIREMENT_AGE)
			work(1600);
	}

	private void delegate(int hours) {
		coWorker.work(hours);
	}

	public String info() {
		return name + " earned " + earned;
	}
}