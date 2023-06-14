package mvc.java.kadai.se.cat01.sec06_extend.no007;

public class AnimalHospital {

	private Animal[] patients = new Animal[6];
	private int patientIndex = 0;

	public void enterHospital(Animal patient) {
		patients[patientIndex] = patient;
		patientIndex++;
		patient.cry();
		System.out.println(patient.getName() + "が入院しました");
	}

	public void showAllPatientList() {

		System.out.println("◆患者さんリスト");

		for (int i = 0; i < patients.length; i++) {
			Animal animal = patients[i];
			System.out.println(animal.getName() + "(" + animal.getAge() + "才)");
		}

	}

}
