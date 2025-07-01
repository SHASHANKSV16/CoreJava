class Hospital {
    public static void main(String specialization[]) {

        String doctorNames[] = { "Cardiologist", "Neurologist", "Dermatologist",
		"Orthopedic Surgeon", "ENT Specialist", "Pediatrician", "Oncologist", 
		"Psychiatrist", "Ophthalmologist", "General Physician" };

        System.out.println(doctorNames[0]);
        System.out.println(doctorNames[1]);
        System.out.println(doctorNames[2]);
        System.out.println(doctorNames[3]);
        System.out.println(doctorNames[4]);
        System.out.println(doctorNames[5]);
        System.out.println(doctorNames[6]);
        System.out.println(doctorNames[7]);
        System.out.println(doctorNames[8]);
        System.out.println(doctorNames[9]);

        for (String doctor : doctorNames) {
            System.out.println(doctor);
        }
    }
}
