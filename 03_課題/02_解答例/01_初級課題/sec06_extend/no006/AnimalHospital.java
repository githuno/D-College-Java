package mvc.java.kadai.se.cat01.sec06_extend.no006;

public class AnimalHospital {

	private Bird[] birdPatients = new Bird[3];
	private int birdPatientIndex = 0;
	private Dog[] dogPatients = new Dog[3];
	private int dogPatientIndex = 0;

	public void enterHospital(Bird patient) {
		birdPatients[birdPatientIndex] = patient;
		birdPatientIndex++;
		patient.cry();
		System.out.println(patient.getName() + "が入院しました");
	}

	public void enterHospital(Dog patient) {
		dogPatients[dogPatientIndex] = patient;
		dogPatientIndex++;
		patient.cry();
		System.out.println(patient.getName() + "が入院しました");
	}

	public void showAllPatientList() {

		System.out.println("◆患者さんリスト");

		for (int i = 0; i < birdPatients.length; i++) {
			Bird bird = birdPatients[i];
			System.out.println(bird.getName() + "(" + bird.getAge() + "才)");
		}

		for (int i = 0; i < dogPatients.length; i++) {
			Dog dog = dogPatients[i];
			System.out.println(dog.getName() + "(" + dog.getAge() + "才)");
		}

	}

}
