class VFSRunner {
    public static void main(String[] vfs) {

        boolean user = VFS.registrationUser(null, "Sharma", "sharma@gmail.com", 0, "pass123", "pass123");
        System.out.println("The user is registered: " + user);
        if(user) VFS.getDetails();

        System.out.println();

        boolean user1 = VFS.registrationUser("Yogi", "Sharma", "yogi@gmail.com", 9876543210L, "pass123", "pass123");
        System.out.println("The user is registered: " + user1);
        if(user1) VFS.getDetails();
    }
}
