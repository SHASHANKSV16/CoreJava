class Appointment {
    public static void scheduleAppointment(String buyer, String seller) {
        System.out.println("Booking appointment at Sub Registrar office for " + buyer + " and " + seller);
        DocumentSubmission.submitDocuments(buyer, seller, "Sale Deed, ID Proofs");
    }
}