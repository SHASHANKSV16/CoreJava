class AgreementDraft {
    public static void prepareAgreement(String property, String buyer, String seller, int amount) {
        System.out.println(" Preparing sale agreement for " + buyer);
        System.out.println("Amount = " + amount);
        Appointment.scheduleAppointment(buyer, seller);
    }
}