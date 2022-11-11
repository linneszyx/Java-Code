class th1
{
    public static void main(String[] args) 
{
        // main() is run in a single thread
        System.out.println(Thread.currentThread());
        for (int i=0; i<10; i++) {
            System.out.println("i == " + i);
        }
    }

}
