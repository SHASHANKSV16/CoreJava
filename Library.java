class Library {
    public static void main(String books[]) {

        String bookNames[] = { "The Alchemist", "1984", "To Kill a Mockingbird", 
		"Pride and Prejudice", "Harry Potter", "The Hobbit", "Moby Dick", "The Great Gatsby" };

        System.out.println(bookNames[0]);
        System.out.println(bookNames[1]);
        System.out.println(bookNames[2]);
        System.out.println(bookNames[3]);
        System.out.println(bookNames[4]);
        System.out.println(bookNames[5]);
        System.out.println(bookNames[6]);
        System.out.println(bookNames[7]);

        for (String book : bookNames) {
            System.out.println(book);
        }
    }
}
