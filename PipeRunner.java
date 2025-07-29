class PipeRunner {
    public static void main(String[] pipes) {

        String colors[] = {"black", "blue", "green"};

        Pipe firstPipe = new Pipe(1, 2.5, 3.0, colors, 120.0);
        firstPipe.getData();

        Pipe secondPipe = new Pipe(2, 1.8);
        System.out.println("the pipe id is " + secondPipe.pipeId);
        System.out.println("the diameter is " + secondPipe.diameter);
        System.out.println();

        Pipe thirdPipe = new Pipe(3, 3.0, 4.5);
        System.out.println("the pipe id is " + thirdPipe.pipeId);
        System.out.println("the diameter is " + thirdPipe.diameter);
        System.out.println("the length is " + thirdPipe.length);
        System.out.println();
    }
}
