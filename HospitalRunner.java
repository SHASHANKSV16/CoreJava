class HospitalRunner {

    static String doctor1 = "Cardiologist";
    static String doctor2 = "Neurologist";
    static String doctor3 = "Dermatologist";
    static String doctor4 = "Orthopedic Surgeon";
    static String doctor5 = "ENT Specialist";
    static String doctor6 = "Pediatrician";
    static String doctor7 = "Oncologist";
    static String doctor8 = "Psychiatrist";
    static String doctor9 = "Ophthalmologist";
    static String doctor10 = "General Physician";

    static String[] doctorNames = {
        doctor1, doctor2, doctor3, doctor4, doctor5,
        doctor6, doctor7, doctor8, doctor9, doctor10
    };

    public static void main(String[] hosp) {
        Hospital.getDoctorSpecializations();
    }
}
