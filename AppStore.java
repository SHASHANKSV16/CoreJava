class AppStore {

    public static void getApps() {
        for (String app : AppStoreRunner.appNames) {
            System.out.println(app);
        }
    }

}